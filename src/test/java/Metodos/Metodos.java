package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elementos.Elementos;

public class Metodos {
	
	Elementos el = new Elementos();
	
	private static WebDriver driver;

	public static WebDriver navegador() {
		return driver;

	}

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void fecharNavegador() {

		driver.quit();
	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();
	

	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void printScr(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot)navegador());
		File nomeArq = scrShot.getScreenshotAs(OutputType.FILE);
		File destArq = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(nomeArq, destArq);

	}
	
	public void apagarCampo(By elemento) {
		
		driver.findElement(elemento).clear();
	}



	
}
