package Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.ConfigReader;

public class GuruLogin_TC1 extends BaseClass {
	
	ConfigReader config;
	@Test(priority=1)
	public void Login_TC01() throws InterruptedException {
		
		config = new ConfigReader();
		driver.findElement(By.name("uid")).sendKeys(config.getUserID());
		driver.findElement(By.name("password")).sendKeys(config.getPassword());
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(6000);
	}
	@Test(enabled=false)
	public void CreateNewCustomer() throws InterruptedException {
		
		config = new ConfigReader();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("name")).sendKeys(config.getCustomerName());
		driver.findElement(By.name("rad1")).click();
		driver.findElement(By.name("dob")).sendKeys(config.getDateofBirth());
		driver.findElement(By.name("addr")).sendKeys(config.getAddress());
		driver.findElement(By.name("city")).sendKeys(config.getCity());
		driver.findElement(By.name("state")).sendKeys(config.getState());
		driver.findElement(By.name("pinno")).sendKeys(config.getPIN());
		driver.findElement(By.name("telephoneno")).sendKeys(config.getMobileNumber());
		driver.findElement(By.name("emailid")).sendKeys(config.getEmail());
		driver.findElement(By.name("password")).sendKeys(config.getPasswordCustomer());
		driver.findElement(By.name("sub")).click();
		Thread.sleep(10000);
		
		WebElement text = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p"));
		String displayText = text.getText();
		System.out.println("the confirmation message is " + displayText );
		assertEquals(displayText, "Customer Registered Successfully!!!");
		
		
		
		
		
	}
	@Test(enabled=false)
	public void EditCustomer() throws InterruptedException {
		
		config = new ConfigReader();
		driver.findElement(By.linkText("Edit Customer")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("cusid")).sendKeys(config.getCustomerID());
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("pinno")).clear();
		Thread.sleep(4000);
		driver.findElement(By.name("pinno")).sendKeys("500018");
		driver.findElement(By.name("sub")).click();
		Thread.sleep(5000);
		
	}
	@Test(priority=2)
	public void CreateNewAccount() throws InterruptedException {
		
		config = new ConfigReader();
		driver.findElement(By.linkText("New Account")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("cusid")).sendKeys(config.getCustomerID());
		driver.findElement(By.name("inideposit")).sendKeys(config.getDeposit());
		driver.findElement(By.name("button2")).click();
		Thread.sleep(5000);
		WebElement confirmmessage = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p"));
		String displaymsg = confirmmessage.getText();
		System.out.println(displaymsg);
		assertEquals(displaymsg,"Account Generated Successfully!!!");
		
	}

}
