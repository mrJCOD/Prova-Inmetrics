#Author: mauro_rodrigues15@hotmail.com or github.com/mrJCOD

@cadastro
Feature: Cadastrar novo usuario e login
  Eu como usuário gostaria de fazer um novo cadastro e realizar o login

  @cadastro1
  Scenario: Cadastro de usuario
    Given que eu esteja no "https://inm-test-app.herokuapp.com/accounts/signup/"
    When preencho minhas informacoes de cadastro
    And clico em cadastrar
    Then o sistema direciona para pagina de login

  @cadastro2
  Scenario Outline: Login de usuario
    Given que eu esteja no "https://inm-test-app.herokuapp.com/accounts/login/"
    When preencho minhas informacoes de login
    And clico em Entre
    Then o sistema direciona para a home logado