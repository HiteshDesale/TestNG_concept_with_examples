package test.ng.cross.browser.compatibility.testing;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 
{
	public WebDriver driver;
	
	@Parameters("name")
	@Test
	public void TC1(String name)
	{
		
		if(name.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(name.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(name.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		
	    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("https://m2.assurant.com/accp/agent/login");
		
        driver.findElement(By.name("assurant")).sendKeys("hdesale1@rdalabs.com");
		
		driver.findElement(By.name("dashboard")).sendKeys("assuranttest");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
	}
	
	

}

//public WebDriver driver;
//
//@Parameters("name")
//@BeforeMethod
//public void initiateBrowser(String name)
//{
//	
//	if(name.equals("Chrome"))
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
//	}
//	else if(name.equals("Firefox"))
//	{
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver=new FirefoxDriver();
//	}
//	else if(name.equals("Edge"))
//	{
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver=new EdgeDriver();
//	}
//	
//    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//	
//	driver.get("https://m2.assurant.com/accp/agent/login");
//	
//}
//
//@Test
//public void Login()
//{
//	driver.findElement(By.name("assurant")).sendKeys("hdesale1@rdalabs.com");
//	
//	driver.findElement(By.name("dashboard")).sendKeys("assuranttest");
//	
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
//}
//
//@AfterMethod
//public void closeBrowser()
//{
//	driver.quit();
//}
