Feature: Validart textos getnet

  Scenario: Deve validar o texto do modal
  	Given Que eu acessei o site da Getnet
    When eu acessar a Central de Ajuda
    And pesquisar por "superget"
    And clicar no link "Como acesso a minha conta SuperGet?"
    Then deve verificar se o título do modal é "Como acesso a minha conta SuperGet?"
