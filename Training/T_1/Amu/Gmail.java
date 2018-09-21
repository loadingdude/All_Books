package com.cloudcollab.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\soft1\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("amrutha.murthy92@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("amulbutter");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='wO nr l1']")).sendKeys("klslokesh9969@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Selenium script");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Lokesh i'm running my selenium script by taking an example of sending a mail to someone so, i'm trying by giving ur mail ID....");
		//driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='gb_8a gbii']")).click();
		driver.findElement(By.id("gb_71")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
