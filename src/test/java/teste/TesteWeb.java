package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteWeb {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "E:\\downloads\\chromedriver\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		
		navegador.get("http://fila-saaec.herokuapp.com/");
		
		navegador.findElement(By.className("light-blue")).click();
		navegador.findElement(By.name("numberWhatsApp")).sendKeys("88987654321");		
		navegador.findElement(By.name("name")).sendKeys("Fulano Beltrano");
		navegador.findElement(By.name("process")).sendKeys("123456");
		navegador.findElement(By.name("cpf")).sendKeys("123.456.789-00");
		navegador.findElement(By.name("adress")).sendKeys("Rua dos Bobos n. 0");
		navegador.findElement(By.name("observations")).sendKeys("Testado por Danilo, Felipe e Felix");
		Select dropdown = new Select(navegador.findElement(By.name("serviceType")));
		dropdown.selectByVisibleText("Religação");
		navegador.findElement(By.className("green")).click();

		String resultado = navegador.getTitle();
		assertEquals("Fila - SAAEC", resultado);
	}

}
