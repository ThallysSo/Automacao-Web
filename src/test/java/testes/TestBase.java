package testes;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	WebDriver navegador;

	@Before
	public void abreNavegador() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		navegador = new ChromeDriver(); // instacia o chrome driver
		navegador.get("https://lojaexemplod.lojablindada.com"); // abri uma url
		navegador.manage().window().maximize(); // maximizar a tela
	}

	@After
	public void fechaNavegador() {
		navegador.quit(); // sempre fechar o chrome driver
	}

}
