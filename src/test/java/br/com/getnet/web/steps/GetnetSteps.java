package br.com.getnet.web.steps;

import static br.com.getnet.web.config.DriverFactory.getDriver;
import static br.com.getnet.web.config.DriverFactory.tearDown;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import br.com.getnet.web.pages.GetnetPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetnetSteps {
	
	WebDriver driver;
	GetnetPage getnetPage;
	
	public GetnetSteps () {
		driver = getDriver();
		getnetPage = new GetnetPage(driver);
	}
	
	@Given("I access the Getnet website")
	public void iAccessTheGetnetWebsite() {
		getnetPage.navigateToGetnet();
	}

	@When("I access the Central de Ajuda")
	public void iAcessTheCentralDeAjuda() {
		getnetPage.clickCentralDeAjuda();
	}
	
	@When("search for {string}")
	public void searchFor(String string) {
		getnetPage.searchSuperGet(string);
	}
	
	@When("click on the link Como acesso a minha conta SuperGet?")
	public void clickOnTheLinkComoAcessoAMinhaContaSuperGet() {
			getnetPage.clickComoAcessoMinhaContaSuperGet();
	}
	
	@Then("must check if the modal title is {string}")
	public void mustCheckIfTheModalTitleIs(String string) {
		assertEquals(string, getnetPage.txtModalTitle.getText());
	}

	@When("click on Ver mais in title Conta SuperGet")
	public void clickOnVerMaisInTitleContaSuperGet() {
		getnetPage.clickVerMaisContaSuperGet();
	}


	@After
	public void fecharBrowser(Scenario scenario) {
		tearDown(scenario);
	}


}
