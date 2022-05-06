package com.Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {

	public static String getData(int row, int cell, String Filename) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Nikita\\Documents\\eclipse-workspace\\Selenium_10_Maven_KiteZerodha\\src\\test\\resources\\Zerodha.xlsx");
	    String Value =WorkbookFactory.create(file).getSheet(Filename).getRow(row).getCell(cell).getStringCellValue();
	    return Value;
	}
}
