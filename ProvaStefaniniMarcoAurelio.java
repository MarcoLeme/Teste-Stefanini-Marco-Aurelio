package br.com.prova_stefanini_igr.prova_stefanini;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProvaStefaniniMarcoAurelio {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");

		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void envioFormulario() {

		driver.findElement(By.id("name")).sendKeys("Marco Aurélio Leme Molina");
		driver.findElement(By.id("email")).sendKeys("marcoleme35@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("#register")).click();
		driver.findElement(By.id("name")).sendKeys("João Batista");
		driver.findElement(By.id("email")).sendKeys("joaobatista@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("#register")).click();
		driver.findElement(By.id("removeUser1")).click();
		

	}

}
