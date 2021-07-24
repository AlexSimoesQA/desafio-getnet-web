Feature: Validate the modal title

  Scenario: Must validate the modal title
  	Given Que eu acessei o site da Getnet
    When eu acessar a Central de Ajuda
    And clicar em "Ver mais" no título "Conta SuperGet"
    And clicar no link "Como acesso a minha conta SuperGet?"
    Then deve verificar se o título do modal é "Como acesso a minha conta SuperGet?"
