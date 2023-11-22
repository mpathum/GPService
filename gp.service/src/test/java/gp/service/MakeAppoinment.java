package gp.service;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseGP;


public class MakeAppoinment extends BaseGP{
	
	@Test
	public void login() throws InterruptedException{
//		if(driver.findElement(By.xpath(loc.getProperty("accept_button"))).isDisplayed()) {
//		driver.findElement(By.xpath(loc.getProperty("accept_button"))).click();
//	}
//		// --------------  Backup URL ------------------------//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.name("email")).sendKeys("ruby1@mailinator.com");
//		driver.findElement(By.name("password")).sendKeys("Shakila@123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath(loc.getProperty("accept_button"))).isDisplayed()) {
			driver.findElement(By.xpath(loc.getProperty("accept_button"))).click();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name(loc.getProperty("email_field"))).sendKeys(data.getProperty("email"));
		driver.findElement(By.name(loc.getProperty("password_field"))).sendKeys(data.getProperty("password"));
		driver.findElement(By.xpath(loc.getProperty("signin_button"))).click();
				
		String expectedTitle="Login to Our App | The GP Service";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath(loc.getProperty("see_a_doctor_button"))).click();
		driver.findElement(By.xpath(loc.getProperty("app_time"))).click();
		
		driver.findElement(By.name(loc.getProperty("complaint_field"))).sendKeys(data.getProperty("complaint"));
		driver.findElement(By.name(loc.getProperty("postcode"))).sendKeys(data.getProperty("postcode"));
		
		driver.findElement(By.xpath(loc.getProperty("find_button"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("bootsPharmacy"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("confirm_button"))).click();
		
		
		
	}
	

}
