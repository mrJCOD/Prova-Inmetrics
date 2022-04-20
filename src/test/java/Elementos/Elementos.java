package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By senha = By.name("pass");
	private By confSenha = By.name("confirmpass");
	private By cadastrar = By.xpath("/html/body/div/div/div/form/div[7]/button");
	private By usuario = By.name("username");
	private By entre = By.xpath("/html/body/div/div[2]/div/form/div[6]/button");
	private By novoFuncionario = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");
	
	/// home novo funcionario
	
	private By nomeFuncionario = By.id("inputNome");
	private By cpfFuncionario = By.id("cpf");
	private By selectSexo = By.id("slctSexo");
	private By selectMasculino = By.xpath("//*[@id=\"slctSexo\"]/option[4]");
	private By admissao = By.id("inputAdmissao");
	private By cargo = By.id("inputCargo");
	private By salario = By.id("dinheiro");
	private By clt = By.id("clt");
	private By enviar = By.xpath("/html/body/div/div[2]/div/form/div[3]/input");
	private By pesquisarFuncionario = By.xpath("//*[@id=\"tabela_filter\"]/label/input");
	private By editarFuncionario = By.xpath("//*[@id=\"tabela\"]/tbody/tr/td[6]/a[2]/button/span");
	private By enviarEdicaoFuncionario = By.xpath("/html/body/div/div/div/form/div[3]/input");
	private By excluirFuncionario = By.xpath("//*[@id=\"delete-btn\"]");
	
	
	public By getUsuario() {
		return usuario;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfSenha() {
		return confSenha;
	}
	public By getCadastrar() {
		return cadastrar;
	}
	public By getEntre() {
		return entre;
	}
	public By getNovoFuncionario() {
		return novoFuncionario;
	}
	public By getNomeFuncionario() {
		return nomeFuncionario;
	}
	public By getCpfFuncionario() {
		return cpfFuncionario;
	}
	public By getSelectSexo() {
		return selectSexo;
	}
	public By getSelectMasculino() {
		return selectMasculino;
	}
	public By getAdmissao() {
		return admissao;
	}
	public By getCargo() {
		return cargo;
	}
	public By getSalario() {
		return salario;
	}
	public By getClt() {
		return clt;
	}
	public By getEnviar() {
		return enviar;
	}
	public By getPesquisarFuncionario() {
		return pesquisarFuncionario;
	}
	public By getEditarFuncionario() {
		return editarFuncionario;
	}
	public By getEnviarEdicaoFuncionario() {
		return enviarEdicaoFuncionario;
	}
	public By getExcluirFuncionario() {
		return excluirFuncionario;
	}

	

}
