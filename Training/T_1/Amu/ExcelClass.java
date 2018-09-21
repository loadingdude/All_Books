package com.cloudcollab.selenium;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import com.sun.media.sound.InvalidFormatException;
	
	public class ExcelClass {
		public static void main(String[] args) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		  try {
		   FileInputStream fis = new FileInputStream("D:\\cloudcollab\\database.xlsx");
		   Workbook wb = WorkbookFactory.create(fis);
		   org.apache.poi.ss.usermodel.Sheet s = wb.getSheet("Login");
		   for(int i = 0; i <= 0; i++) {
		    Row r = s.getRow(1);
		    Cell c = r.getCell(0);
		    String str = c.getStringCellValue();
		    //System.out.println(str);
		    System.setProperty("webdriver.gecko.driver", "D:\\soft1\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		    WebDriver driver = new FirefoxDriver();
		    driver.get(str);
		    Thread.sleep(2000);
		    driver.quit();
		   }
		   
		  }
		  catch(FileNotFoundException e) {
		   e.printStackTrace();
		  }
		  catch(EncryptedDocumentException e) {
		   e.printStackTrace();
		  }
		  catch(InvalidFormatException e) {
		   e.printStackTrace();
		  }
		  catch(IOException e) {
		   e.printStackTrace();
		  }
		  
		}
	}

