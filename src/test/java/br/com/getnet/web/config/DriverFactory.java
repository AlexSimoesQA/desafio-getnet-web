package br.com.getnet.web.config;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	
	private DriverFactory() {
	}
	
	public static WebDriver getDriver() {
		if (driver == null)
			setUp();
		return driver;
	}
	
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) getDriver();
				File arquivo = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
						File.separator + scenario.getName() + "is Fail" + ".jpg"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				TakesScreenshot screenshot = (TakesScreenshot) getDriver();
				File arquivo = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
						File.separator + scenario.getName() + "is Pass" + ".jpg"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
