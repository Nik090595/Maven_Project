package com.Utilites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void getScreenshot(WebDriver driver, String FileName) throws IOException {
		String Time = Date.TimeStamp();
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Nikita\\Documents\\eclipse-workspace\\Selenium_10_Maven_KiteZerodha\\Screenshot\\" +FileName+ "_"+Time +".jpg");
		FileHandler.copy(Source, Destination);
	}
}
