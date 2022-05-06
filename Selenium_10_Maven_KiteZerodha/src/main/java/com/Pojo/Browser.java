package com.Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

	public static WebDriver OpenBrowser(String URL) {//this method return webdriver which is  driver  
		ChromeOptions option = new ChromeOptions(); //Class of Selenium
		option.addArguments("--disable-notifications");//will disable chrome notification
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikita\\Documents\\eclipse-workspace\\Selenium_10_Maven_KiteZerodha\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		return driver;
	}
}
