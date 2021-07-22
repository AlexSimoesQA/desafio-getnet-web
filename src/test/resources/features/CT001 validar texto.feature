Feature: Validart textos getnet

  Background: 
    Given Que eu acessei o site da Getnet

  Scenario: Deve validar o texto do modal
    When eu acessar a Central de Ajuda
    And pesquisar por "superget"
    And clicar no link "Como acesso a minha conta SuperGet?"
    Then deve verificar se o título do modal é "Como acesso a minha conta SuperGet?"
