package br.com.getnet.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetnetPage {
	WebDriver driver;
	
	public GetnetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Ajuda")
	public WebElement linkAjuda;
	
	@FindBy(linkText = "Central de ajuda")
	public WebElement linkCentraldeAjuda;
	
	@FindBy(id = "faq-search-input")
	public WebElement searchField;
	
	@FindBy(css = "div.cc-compliance")
	public WebElement policyAndPrivacyTermsOK;
	
	@FindBy(xpath = "//button[@class='c-search-dropdown__read-more c-search__read-more js-search-box__button']")
	public WebElement verMais;
	
	@FindBy(xpath = "//section/div/a[1]")
	public WebElement paginaDois;
	
	@FindBy(xpath = "//a[@class='o-fixed-footer-slot__close js-fixed-footer-slot__close js-gtm-trigger']")
	public WebElement closeFooter;
	
	@FindBy(xpath = "//a[@class='c-search-page__link']/h3[text()='Como acesso a minha conta SuperGet?']")
	public WebElement comoAcessoSuperGet;
	
	@FindBy(css = "body > div.o-modal.is-modal-open > div > div.o-modal__title")
	public WebElement txtModalTitle;
	
	@FindBy(xpath = "//a[contains(@href, 'conta-superget') and text()='ver mais']")
	public WebElement verMaisContaSuperGet;
	
	@FindBy(xpath = "//a[contains(@class, 'c-more-answers__question js-modal-price-cards') and text()='Como acesso a minha conta SuperGet?']")
	public WebElement comoAcessoMinhaContaSuperGet;
	
	
	public void navigateToGetnet() {
		driver.get("https://site.getnet.com.br");
	}
	
	public void clickCentralDeAjuda() {
		Actions action = new Actions(driver);
		WebElement element = linkAjuda;
		action.moveToElement(element).build().perform();
		
		linkCentraldeAjuda.click();
		
	}
	
	public void searchSuperGet(String string) {
		policyAndPrivacyTermsOK.click();
		searchField.sendKeys(string);
		verMais.click();
		closeFooter.click();
		paginaDois.click();
	}
	
	public void clickComoAcessoMinhaContaSuperGet() {
		try {
			comoAcessoMinhaContaSuperGet.click();
		} catch (Exception e) {
			comoAcessoSuperGet.click();
		}
	}
	
	public void clickVerMaisContaSuperGet() {
		policyAndPrivacyTermsOK.click();
		verMaisContaSuperGet.click();
	}
	
}
