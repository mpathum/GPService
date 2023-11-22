package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseGP {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static Properties data = new Properties();
	public static FileReader fr ;
	
	@BeforeTest
	public void setup() throws IOException {
		System.out.println("============ START TEST GP SERVICE =============");
		if(driver==null) {
//			FileReader fr = new FileReader("C:\\Users\\pabeynayake\\eclips Sellenium\\gp.service\\src\\test\\resources\\configfiles\\config.properties");
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			FileReader fr2 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			FileReader fr3 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\data.properties");
			prop.load(fr);
			loc.load(fr2);
			data.load(fr3);
			
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			
		}
		
		
	}
	
	@AfterTest
	public void tearDown() {
//		driver.close();
		System.out.println("============ END TEST =============");
	}

}
