package Steps;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();
	

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		
		met.abrirNavegador(site);

	}

	@When("preencho minhas informacoes de cadastro")
	public void preencho_minhas_informacoes_de_cadastro() throws IOException {

		met.escrever("Felipe Silva", el.getUsuario());
		met.escrever("teste@123", el.getSenha());
		met.escrever("teste@123", el.getConfSenha());
		met.printScr("Evidencia Teste 01 Informacoes de cadastro");
	}

	@When("clico em cadastrar")
	public void clico_em_cadastrar() throws InterruptedException {
		
		met.clicar(el.getCadastrar());
		Thread.sleep(2000);
	}

	@Then("o sistema direciona para pagina de login")
	public void o_sistema_direciona_para_pagina_de_login() throws IOException {
		
		met.printScr("Evidencia Teste 01 Cadastro");
		met.fecharNavegador();

	}

	@When("preencho minhas informacoes de login")
	public void preencho_minhas_informacoes_de_login() throws IOException {
		
		met.escrever("Felipe Silva", el.getUsuario());
		met.escrever("teste@123", el.getSenha());
		met.printScr("Evidencia Teste 02 Informacoes de login");

	}

	@When("clico em Entre")
	public void clico_em_entre() throws InterruptedException {
		met.clicar(el.getEntre());
		Thread.sleep(2000);

	}

	@Then("o sistema direciona para a home logado")
	public void o_sistema_direciona_para_a_home_logado() throws IOException {
		
		met.printScr("Evidencia teste 02 Logado");
		met.fecharNavegador();

	}
	
	// TESTE DE FUNCIONARIOS
	
	@Given("que eu esteja logado no {string}")
	public void que_eu_esteja_logado_no(String site) {
		
		met.abrirNavegador(site);

		
	}
	
	@Given("realizo o login")
	public void realizo_o_login() throws InterruptedException {
		met.escrever("Felipe Silva", el.getUsuario());
		met.escrever("teste@123", el.getSenha());
		met.clicar(el.getEntre());
		Thread.sleep(2000);
	}

	@Given("clico em Novo Funcionario")
	public void clico_em_novo_funcionario() throws InterruptedException {
		
		met.clicar(el.getNovoFuncionario());
		Thread.sleep(2000);

		
	}

	@Given("o sistema direciona para a criacao de novo funcionario")
	public void o_sistema_direciona_para_a_criacao_de_novo_funcionario() throws IOException {
		
		met.printScr("Evidencia Teste novo funcionario 01");

		
	}

	@Given("preencho as informacoes do novo funcionario")
	public void preencho_as_informacoes_do_novo_funcionario() {
		
		met.escrever("Celso Augusto", el.getNomeFuncionario());
		met.escrever("Analista de Teste", el.getCargo());
		met.escrever("350000", el.getSalario());
		met.escrever("19042022", el.getAdmissao());
		met.clicar(el.getClt());
		met.clicar(el.getSelectSexo());
		met.clicar(el.getSelectMasculino());
		met.escrever("442.810.038-86", el.getCpfFuncionario());

		
	}

	@When("clico em enviar")
	public void clico_em_enviar() throws InterruptedException {
		
		met.clicar(el.getEnviarEdicaoFuncionario());
		Thread.sleep(2000);

		
	}

	@Then("o sistema adiciona um novo funcionario na tabela")
	public void o_sistema_adiciona_um_novo_funcionario_na_tabela() throws IOException {

		met.printScr("Evidencia teste novo funcionaro 02");
		met.fecharNavegador();
	}
	
	// Editando funcionario
	
	@Given("pesquiso pelo funcionario no qual eu quero editar")
	public void pesquiso_pelo_funcionario_no_qual_eu_quero_editar() {

		met.escrever("celso", el.getPesquisarFuncionario());
	}

	@Given("clico em editar funcionario")
	public void clico_em_editar_funcionario() {
		
		met.clicar(el.getEditarFuncionario());

		
	}

	@When("o sistema me direciona para edicao do funcionario")
	public void o_sistema_me_direciona_para_edicao_do_funcionario() throws IOException {
		
		met.printScr("Evidencia edicao funcionario 01");

		
	}

	@When("altero a informacao desejada")
	public void altero_a_informacao_desejada() throws InterruptedException {
		met.apagarCampo(el.getSalario());
		met.escrever("500000", el.getSalario());
		Thread.sleep(2000);
		
	}

	@Then("o sistema atualiza o cadastro do usuario")
	public void o_sistema_atualiza_o_cadastro_do_usuario() throws IOException {
		
		met.printScr("Evidencia funcionario editado");
		met.fecharNavegador();

		
	}
	
	//EXCLUINDO FUNCIONARIO
	
	@When("pesquiso pelo funcionario no qual eu quero excluir")
	public void pesquiso_pelo_funcionario_no_qual_eu_quero_excluir() {
		
		met.escrever("celso", el.getPesquisarFuncionario());

		
	}

	@When("clico em excluir funcionario")
	public void clico_em_excluir_funcionario() throws InterruptedException {
		
		met.clicar(el.getExcluirFuncionario());
		Thread.sleep(2000);

		
	}

	@Then("o sistema exclui o funcionario e retorna uma mensagem de sucesso")
	public void o_sistema_exclui_o_funcionario_e_retorna_uma_mensagem_de_sucesso() throws IOException {
		
		met.printScr("Evidencia excluir funcionario");
		met.fecharNavegador();

		
	}


}
