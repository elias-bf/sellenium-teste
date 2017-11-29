package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestarGoogle {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br/");
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("Níveis de teste");
		campoDeTexto.submit();
	}
}
