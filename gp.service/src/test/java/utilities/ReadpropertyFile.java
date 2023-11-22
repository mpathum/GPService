package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;



public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
			FileReader filer = new FileReader("C:\\Users\\pabeynayake\\eclips Sellenium\\gp.service\\src\\test\\resources\\configfiles\\config.properties");
			Properties p= new Properties();
			p.load(filer);
			
			System.out.println(p.getProperty("browser"));
			System.out.println(p.getProperty("testurl"));
	}

}
