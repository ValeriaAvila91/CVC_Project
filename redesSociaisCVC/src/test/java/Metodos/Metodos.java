package Metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elementos.Elementos;

public class Metodos {

	Elementos el = new Elementos();

	WebDriver driver;

	public void abrirNavegador() {

		String url = "https://www.cvc.com.br/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void validar(By elemento, String msgEsperada) {

		String novaJanela = driver.getWindowHandle();
		Set<String> janelas = driver.getWindowHandles();
		Iterator<String> iterator = janelas.iterator();
		while (iterator.hasNext()) {
			String janelaFilha = iterator.next();
			if (!novaJanela.equalsIgnoreCase(janelaFilha)) {
				driver.switchTo().window(janelaFilha);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
				WebElement text = driver.findElement(elemento);
				String msgCapturada = text.getText();
				assertEquals(msgEsperada, msgCapturada);
				System.out.println("Teste realizado com sucesso! a mensagem exibida é " + msgCapturada);
			}
		}

	}

	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void scrool(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
	}
}
