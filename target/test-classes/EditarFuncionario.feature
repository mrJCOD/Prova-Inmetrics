#Author: mauro_rodrigues15@hotmail.com or github.com/mrJCOD

@editarFuncionario
Feature: Editar um Funcionario
  Eu como usuario quero editar um dado de um usuario

  @editarFuncionario1
  Scenario: Editar funcionario
    Given que eu esteja logado no "https://inm-test-app.herokuapp.com/accounts/login/"
    And realizo o login
    And pesquiso pelo funcionario no qual eu quero editar
    And clico em editar funcionario
    When o sistema me direciona para edicao do funcionario
    And altero a informacao desejada
    And clico em enviar
    Then o sistema atualiza o cadastro do usuario
    