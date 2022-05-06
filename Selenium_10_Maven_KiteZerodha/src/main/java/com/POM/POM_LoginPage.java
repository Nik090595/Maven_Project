package com.POM;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_LoginPage {

	@FindBy (xpath = "//input[@id='userid']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	@FindBy (xpath = "//input[@type='password']") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']")private WebElement cont;
	
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']") private WebElement forget;
	@FindBy (xpath = "//label[text()='I forgot my user ID']") private WebElement RadioButton1;
	@FindBy (xpath = "//input[@placeholder='PAN']") private WebElement Pan;
	@FindBy (xpath = "//label[text()='E-mail']") private WebElement RadioButton2;
	@FindBy (xpath = "//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy (xpath = "//button[@type='submit']")private WebElement Reset;
	
	@FindBy (xpath = "//h2[text()='Login to Kite']") private WebElement title;
	@FindBy (xpath = "//img[@alt='Kite']") private WebElement kite;
	
	@FindBy (xpath = "(//a[@target='_blank'])[3]") private WebElement newAcc; 
	@FindBy (xpath = "//input[@id='user_mobile']") private WebElement newsign;
	
	public POM_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserName (String UserName) {
		username.sendKeys(UserName);
	}
	
	public void EnterPassword(String Password) {
		pass.sendKeys(Password);
	}
	
	public void ClickonLogin() {
		login.click();
	}
	
	public void EnterPin (String Pincode, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(Pincode);
	}
	
	public void ClickonContinue() {
		cont.click();
	}
	
	public String getTitle() {
		return title.getText();
	}
	
	public Dimension getSize() {
		return kite.getSize();
	}
	
	public boolean Logo() {
		return kite.isDisplayed();
	}
	
	public void ClickOnForget() {
		forget.click();
	}
	
	public void ClickOnRadioButton1() {
		RadioButton1.click();
	}
	
	public void EnterPANnumber(String PAN, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.equals(ExpectedConditions.visibilityOf(Pan));
		Pan.sendKeys(PAN);
	}
	
	public void ClickOnRadioButton2() {
		RadioButton2.click();
	}
	
	public void EnterEmailDetails(String Email) {
		email.sendKeys(Email);
	}
	
	public void ClickOnNewAccount() {
		newAcc.click();
	}
	
	public void ClickOnReset() {
		Reset.click();
	}
	
	public void NewAccount(String Phone) {
		newsign.sendKeys(Phone);
	}

}
