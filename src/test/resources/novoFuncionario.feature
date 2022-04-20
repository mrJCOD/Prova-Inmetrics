#Author: mauro_rodrigues15@hotmail.com or github.com/mrJCOD

@funcionario
Feature: Cadastrar novo funcionario, editar e excluir
  Eu como usuario quero cadastrar, editar e excluir um funcionario

  @funcionario1
  Scenario: Cadastrar funcionario
    Given que eu esteja logado no "https://inm-test-app.herokuapp.com/accounts/login/"
    And realizo o login
    And clico em Novo Funcionario
    And o sistema direciona para a criacao de novo funcionario
    And preencho as informacoes do novo funcionario
    When clico em enviar
    Then o sistema adiciona um novo funcionario na tabela
    

