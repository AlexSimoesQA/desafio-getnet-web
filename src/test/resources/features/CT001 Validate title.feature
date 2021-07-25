Feature: Validate the modal title through the search field

  	Scenario: Must validate the modal title through the search field
	  	Given I access the Getnet website
	    When I access the Central de Ajuda
	    And search for "superget"
	    And click on the link Como acesso a minha conta SuperGet?
	    Then must check if the modal title is "Como acesso a minha conta SuperGet?"
