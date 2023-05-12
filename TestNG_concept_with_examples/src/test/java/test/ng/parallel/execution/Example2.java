package test.ng.parallel.execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2
{
	@Test
	public void TC1FacebookURL()
	{
		
	    WebDriverManager.chromedriver().setup();
	    
	    ChromeDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
		
		driver.quit();
		
		
		
	}

}
