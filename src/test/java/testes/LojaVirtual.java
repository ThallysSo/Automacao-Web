package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class LojaVirtual extends TestBase{

	@Test
	public void pesquisaLivro() {
		abreNavegador();
		WebElement pesquisa = navegador.findElement(By.id("search")); //cria um objeto pesquisa passando o findElement pelo id
		pesquisa.sendKeys("Fortaleza Digital", Keys.ENTER);
		WebElement tituloLivro = navegador.findElement(By.xpath("//h2/a"));
		String livro = tituloLivro.getText(); //pega o texto do xpath
		Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
		
		WebElement precoLivro = navegador.findElement(By.cssSelector("#product-price-44 > span")); // > span próximo campo do html
		String preco = precoLivro.getText();													   // Se não tivesse o id poderia ter sido usado span.regular-price > span
		Assert.assertEquals("R$519,90", preco);
		
		fechaNavegador();
	}
	
	//# = id
	//. = class
   //   = tag
}