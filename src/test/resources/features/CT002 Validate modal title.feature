Feature: Validate the modal title
    
    Scenario: Must validate the modal title
	  	Given I access the Getnet website
	    When I access the Central de Ajuda
	    And click on Ver mais in title Conta SuperGet
	    And click on the link Como acesso a minha conta SuperGet?
	    Then must check if the modal title is "Como acesso a minha conta SuperGet?"
