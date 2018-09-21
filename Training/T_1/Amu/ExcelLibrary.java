package com.cloudcollab.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.media.sound.InvalidFormatException;

public class ExcelLibrary {
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {
	String returnValue = null;
	try {
		FileInputStream fis = new FileInputStream("D:\\cloudcollab\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetName);
		Row r= s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		returnValue = c.getStringCellValue();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(EncryptedDocumentException e) {
		e.printStackTrace();
	} catch(InvalidFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return returnValue;
	}
	
	public int getRowCount(String sheetName) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		int rowCount = 0;
		try {
			FileInputStream fis = new FileInputStream("D:\\cloudcollab\\data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			rowCount = s.getLastRowNum();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(EncryptedDocumentException e) {
			e.printStackTrace();
		} catch(InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public void setExcelData(String sheetName, int rowNum, int cellNum, String data) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		try {
			FileInputStream fis = new FileInputStream("D:\\cloudcollab\\data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			Row r= s.getRow(rowNum);
			Cell c = r.createCell(cellNum);
			c.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("D:\\cloudcollab\\data.xlsx");
			wb.write(fos);
		}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch(EncryptedDocumentException e) {
				e.printStackTrace();
			} catch(InvalidFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
