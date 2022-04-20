#Author: mauro_rodrigues15@hotmail.com or github.com/mrJCOD

@excluir
Feature: Excluir funcionario
  Eu como usuario quero excluir um funcionario

  @excluir1
  Scenario: Excluir funcionario
    Given que eu esteja logado no "https://inm-test-app.herokuapp.com/accounts/login/"
    And realizo o login
    When pesquiso pelo funcionario no qual eu quero excluir
    And clico em excluir funcionario
    Then o sistema exclui o funcionario e retorna uma mensagem de sucesso
