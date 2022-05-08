package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public ConfigReader config;
	public WebDriver driver;
	@BeforeTest
	public void SetUP() throws InterruptedException {
		
		config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getChromeDriverPath());
		driver = new ChromeDriver();
		driver.get(config.getURL());
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		
	}
	@AfterTest
	public void closeSession() {
		
		//driver.quit();
	}

}
