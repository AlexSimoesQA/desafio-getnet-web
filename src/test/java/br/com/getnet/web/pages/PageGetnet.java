package br.com.getnet.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.getnet.web.config.BasePage;

public class PageGetnet extends BasePage{

	public PageGetnet(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Central de ajuda")
	public WebElement link_Central_de_Ajuda;
	@FindBy(linkText = "Ajuda")
	public WebElement link_Ajuda;
	
	public PageGetnet clickAndAssertCentralDeAjuda() {
		click(link_Ajuda);
		click(link_Central_de_Ajuda);
		
		return this;
	}

}
