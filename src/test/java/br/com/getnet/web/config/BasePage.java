package br.com.getnet.web.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element){
        element.click();
    }

}
