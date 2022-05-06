package com.TCs;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.POM.POM_LoginPage;
import com.Pojo.Browser;
import com.Utilites.Excelsheet;

public class LoginPage_TCs {

WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
	
//	@Test
//	public void LoginwithBlankInput() {
//		POM_LoginPage POM_LoginPage = new POM_LoginPage(driver);
//		POM_LoginPage.ClickonLogin();
//	}
	
//	@Test
//	public void checkTitle() {
//		POM_LoginPage POM_LoginPage = new POM_LoginPage(driver);
//		String ActTitle = POM_LoginPage.getTitle();
//		String ExpectedTitle="Login to Kite";
//		Assert.assertEquals(ActTitle, ExpectedTitle);
//	}
	
//	@Test
//	public void displayLogo() {
//		POM_LoginPage POM_LoginPage = new POM_LoginPage(driver);
//		boolean ActLogo = POM_LoginPage.Logo();
//		boolean ExpLogo =  ActLogo;
//		Assert.assertEquals(ExpLogo, ActLogo);
//	}
	
	@Test
	public void VerifySizeOfLogo() {
		POM_LoginPage POM_LoginPage = new POM_LoginPage(driver);
		Dimension ActSize = POM_LoginPage.getSize();
	    Dimension d = new Dimension (60,40);
		Dimension ExpSize = d;
		Assert.assertEquals(ActSize, ExpSize);	
	}
	
//	@Test
//	public void LoginwithUserID() throws EncryptedDocumentException, IOException {
//		POM_LoginPage POM_LoginPage = new POM_LoginPage (driver);
//		String UserName = Excelsheet.getData(0, 1, "ABCD");
//		POM_LoginPage.ClickonLogin();
//	}
//	
//	@Test
//	public void ClickOnForgetPass() {
//		POM_LoginPage POM_LoginPage = new POM_LoginPage (driver);
//		POM_LoginPage.ClickOnForget();
//	}
	
	@Test
	public void ClickOnNewAccount() throws EncryptedDocumentException, IOException {
		POM_LoginPage POM_LoginPage = new POM_LoginPage (driver);
		POM_LoginPage.ClickOnNewAccount();
		ArrayList<String> list = new ArrayList(driver.getWindowHandles());
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		driver.switchTo().window(list.get(1));
		String Phone = Excelsheet.getData(3, 1, "ABCD");
		POM_LoginPage.ClickOnNewAccount();
		String ActPage = POM_LoginPage.getTitle();
		String ExpPage ="Signup and open a Zerodha trading and demat account online and start investing – Zerodha";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(ActPage,ExpPage);
	}
	
//	@Test
//	public void ForgotPassword() throws EncryptedDocumentException, IOException {
//		POM_LoginPage POM_LoginPage = new POM_LoginPage (driver);
//		POM_LoginPage.ClickOnForget();
//		POM_LoginPage.ClickOnRadioButton1();
//		String PAN = Excelsheet.getData(4, 1, "ABCD");
//		POM_LoginPage.EnterPANnumber(PAN, driver);
//		POM_LoginPage.ClickOnRadioButton2();
//		String Email = Excelsheet.getData(5, 1, "ABCD");
//		POM_LoginPage.EnterEmailDetails(Email);
//		POM_LoginPage.ClickOnReset();
//		String ActPage = POM_LoginPage.getTitle();
//		String ExpPage = "Forgot password / Kite";  
//		Assert.assertEquals(ActPage, ExpPage);
//	}
//	
//	@Test
//	public void TestCase() throws EncryptedDocumentException, IOException {
//		POM_LoginPage POM_LoginPage = new com.POM.POM_LoginPage(driver);
//		String ActPage = POM_LoginPage.getTitle();
//		String ExpPage = "Dashboard / Kite";  
//		Assert.assertEquals(ActPage, ExpPage);
//		String UserName = Excelsheet.getData(0, 1, "ABCD");
//		POM_LoginPage.EnterUserName(UserName);
//		String Password = Excelsheet.getData(1, 1, "ABCD");
//		POM_LoginPage.EnterPassword(Password);
//		POM_LoginPage.ClickonLogin();
//		String Pincode = Excelsheet.getData(2, 1, "ABCD");
//		POM_LoginPage.EnterPin(Pincode, driver);
//		POM_LoginPage.ClickonContinue();
//	}
	
}
