package com.TCs;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POM.Velocity_POM_LoginPage;
import com.POM.Velocity_POM_LoginPage;
import com.Pojo.Browser;
import com.Utilites.Excelsheet;

public class Velocity_LoginPage {

WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
	
	@Test
	public void LoginwithBlankInput() {
		Velocity_POM_LoginPage Velocity_POM_LoginPage = new Velocity_POM_LoginPage(driver);
		Velocity_POM_LoginPage.ClickonLogin();
	}
	
	
	@Test
	public void LoginwithUserID() throws EncryptedDocumentException, IOException {
		Velocity_POM_LoginPage Velocity_POM_LoginPage = new Velocity_POM_LoginPage (driver);
		String UserName = Excelsheet.getData(0, 1, "Credentials");
		Velocity_POM_LoginPage.ClickonLogin();
	}
	

	@Test
	public void ClickOnDontHaveAccountToCreateNewAccount() throws EncryptedDocumentException, IOException {
		Velocity_POM_LoginPage Velocity_POM_LoginPage = new Velocity_POM_LoginPage (driver);
		Velocity_POM_LoginPage.ClickOnDontHaveAccount();
		ArrayList<String> list = new ArrayList(driver.getWindowHandles());
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		driver.switchTo().window(list.get(1));
		String Phone = Excelsheet.getData(3, 1, "Credentials");
		Velocity_POM_LoginPage.EnterNewMobileNumber(Phone);
	}
	
	@Test
	public void ForgotPassword() throws EncryptedDocumentException, IOException {
		Velocity_POM_LoginPage Velocity_POM_LoginPage = new Velocity_POM_LoginPage (driver);
		Velocity_POM_LoginPage.ClickOnForget();
		Velocity_POM_LoginPage.ClickOnRadioButton1();
		String PAN = Excelsheet.getData(4, 1, "Credentials");
		Velocity_POM_LoginPage.EnterPANnumber(PAN, driver);
		Velocity_POM_LoginPage.ClickOnRadioButton2();
		String Email = Excelsheet.getData(5, 1, "Credentials");
		Velocity_POM_LoginPage.EnterEmailDetails(Email);
		Velocity_POM_LoginPage.ClickOnReset();
	}
	
	@Test
	public void TestCase() throws EncryptedDocumentException, IOException {
		Velocity_POM_LoginPage Velocity_POM_LoginPage = new com.POM.Velocity_POM_LoginPage(driver);
		String UserName = Excelsheet.getData(0, 1, "Credentials");
		Velocity_POM_LoginPage.EnterUserName(UserName);
		String Password = Excelsheet.getData(1, 1, "Credentials");
		Velocity_POM_LoginPage.EnterPassword(Password);
		Velocity_POM_LoginPage.ClickonLogin();
		String Pincode = Excelsheet.getData(2, 1, "Credentials");
		Velocity_POM_LoginPage.EnterPin(Pincode, driver);
		Velocity_POM_LoginPage.ClickonContinue();
	}
}
