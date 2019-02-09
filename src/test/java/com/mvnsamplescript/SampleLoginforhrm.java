package com.mvnsamplescript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleLoginforhrm {
	@Test
	public static void hrmlogin() {
		System.setProperty("webdriver.chrome.driver","E:\\Desktop_bkp\\mail.interglobe.com\\Test\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");
		
		driver.findElement(By.id("txtUsername")).sendKeys("user03");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		
	}
	

}
