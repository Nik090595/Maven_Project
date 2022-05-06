package com.TCs;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.Velocity_POM_DashBoard;
import com.POM.POM_LoginPage;
import com.Pojo.Browser;
import com.Utilites.Excelsheet;

public class Velocity_Dashboard_TCS {

	WebDriver driver;
	
	
	@BeforeMethod
	public void lounchBrowserAndLogin() throws EncryptedDocumentException, IOException {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
		POM_LoginPage pom = new POM_LoginPage(driver);
		String UserName = Excelsheet.getData(0, 1, "Credentials");
		pom.EnterUserName(UserName);
		String Password = Excelsheet.getData(1, 1, "Credentials");
		pom.EnterPassword(Password);
		pom.ClickonLogin();
		String Pincode = Excelsheet.getData(2, 1, "Credentials");
		pom.EnterPin(Pincode, driver);
		pom.ClickonContinue();
	}
	
//	@AfterMethod
//	public void aftermethod() {
//		driver.close();
//	}
	

	@Test
	public void buyStock() throws EncryptedDocumentException, IOException {
		Velocity_POM_DashBoard pom = new Velocity_POM_DashBoard(driver);
	    Assert.assertTrue(pom.displayedAvatar(driver));
		String StockName = Excelsheet.getData(6, 1, "Credentials");
		pom.searchStock(StockName);
		pom.clickOnFirstStock(driver);
		pom.clickOnBuy();
		pom.clickOnStockBSE(driver);
	}
}
