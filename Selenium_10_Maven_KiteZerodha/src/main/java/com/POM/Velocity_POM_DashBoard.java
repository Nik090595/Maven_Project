package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Velocity_POM_DashBoard {

	@FindBy (xpath = "//div[@id ='avatar-83']") private WebElement avatar;
	@FindBy (xpath ="//input[@placeholder='Search eg: infy bse, nifty fut weekly, gold mcx']") private WebElement search;
	@FindBy (xpath = "(//ul[@class='omnisearch-results']//div//li)[1]") private WebElement firstStockName;
	@FindBy (xpath = "//li[@class='search-result-item selected isadded']//button[@class='button-blue']") private WebElement buy;
	@FindBy (xpath = "(//label[@class='su-radio-label'])[1]") private WebElement BSE;
	@FindBy (xpath = "//form[@class='order-window layer-2 place buy']//label[@class='su-switch-control']") private WebElement longTerm;
	
	public Velocity_POM_DashBoard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean displayedAvatar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(avatar));
		return  avatar.isDisplayed();
	}
	
	public void searchStock(String stockName) {
		search.sendKeys(stockName);
	}
	
	public void clickOnFirstStock(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(firstStockName));
		Actions act = new Actions(driver);
		act.moveToElement(firstStockName);
		act.perform();
	}
	
	public void clickOnBuy() {
		buy.click();	}
	
	public void clickOnStockBSE(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(BSE));
		BSE.click();
	}
	
	public void clickOnLongtermStock() {
		longTerm.click();
	}
}
