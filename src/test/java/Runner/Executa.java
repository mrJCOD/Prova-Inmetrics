package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./src/test/resources",
		glue = "Steps",
		tags = "@excluir",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/reportExcluirFuncionario.html", "json:target/reportExcluirFuncionario.json"}
		
		
		
		
		)

public class Executa {

}
