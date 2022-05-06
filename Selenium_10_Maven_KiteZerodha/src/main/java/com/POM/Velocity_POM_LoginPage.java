package com.POM;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Velocity_POM_LoginPage {

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
	
	@FindBy (xpath = "//a[@class='text-light']")private WebElement SignUpNewAccount;
	@FindBy (xpath = "//input[@name='mobile']") private WebElement NewMobileNo;
	@FindBy (xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	public Velocity_POM_LoginPage(WebDriver driver) {
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
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(Pincode);
	}
	
	public void ClickonContinue() {
		cont.click();
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
	
	public void ClickOnReset() {
		Reset.click();
	}
	
	
	public String ClickOnDontHaveAccount() {
		SignUpNewAccount.click();
		return SignUpNewAccount.getText();
	}
	
	public void EnterNewMobileNumber(String Phone) {
		NewMobileNo.sendKeys(Phone);;
	}
	
	public void ClickOnContiueButton() {
		continueButton.click();
	}
	
}
