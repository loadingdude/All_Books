package com.cloudcollab.selenium;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutDataDriven {

	public static void main(String[] args) throws InvalidFormatException, InterruptedException {
		ExcelLibrary xl = new ExcelLibrary();
		int rowCount = xl.getRowCount("Login");
		System.setProperty("webdriver.gecko.driver", "D:\\soft1\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		for(int i = 1; i <= rowCount; i++) {
			String un = xl.getExcelData("Login", i, 1);
			String pw = xl.getExcelData("Login", i, 2);
			driver.findElement(By.id("identifierId")).sendKeys(un);
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(pw);
			driver.findElement(By.id("passwordNext")).click();
			try {
				driver.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("gb_71")).click();
				Thread.sleep(2000);
				xl.setExcelData("Login", i, 3, "PASS");
			}
			catch(Exception e) {
				xl.setExcelData("Login", i, 3, "FAIL");
			}
			
		}
		driver.quit();
	}

}
