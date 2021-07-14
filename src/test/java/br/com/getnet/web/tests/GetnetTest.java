package br.com.getnet.web.tests;

import org.junit.Test;

import br.com.getnet.web.config.BaseTest;
import br.com.getnet.web.pages.PageGetnet;

public class GetnetTest extends BaseTest {

	@Test
	public void clickAndAssertCentralDeAjuda() {
		new PageGetnet(driver)
		.clickAndAssertCentralDeAjuda();
	}
}
