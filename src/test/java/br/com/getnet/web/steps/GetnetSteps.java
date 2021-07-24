package br.com.getnet.web.steps;

import static br.com.getnet.web.config.DriverFactory.getDriver;
import static br.com.getnet.web.config.DriverFactory.tearDown;

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
	
	@Given("Que eu acessei o site da Getnet")
	public void queEuAcesseiOSite() {
		getnetPage.navigateToGetnet();
	}

	@When("eu acessar a Central de Ajuda")
	public void euAcessarACentralDeAjuda() {
		getnetPage.clickCentralDeAjuda();
	}
	
	@When("pesquisar por {string}")
	public void pesquisar_por(String string) {
		getnetPage.pesquisarSuperGet(string);
	}
	
	@When("clicar no link {string}")
	public void clicarNoLink(String string) {
		getnetPage.clickLinkComoAcessoSuperGet();
	}
	
	@Then("deve verificar se o título do modal é {string}")
	public void deveVerificarSeOTTuloDoModal(String string) {
		getnetPage.assertTextSuperGet();
	}

	@When("clicar em {string} no título {string}")
	public void clicarEmNoTítulo(String string, String string2) {
		getnetPage.clickVerMaisContaSuperGet();
	}


	@After
	public void fecharBrowser(Scenario scenario) {
		tearDown(scenario);
	}


}
