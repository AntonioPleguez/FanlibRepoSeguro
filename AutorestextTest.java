package fanlib;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class AutorestextTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	String[] nombres = { "Nombre Corto 1", "Nombre Largo 2 con más palabras", null, "Nombre 4", "Nombre 5", "Nombre 6",
			null, "Nombre 8 con más palabras", "Nombre 9", "Nombre Corto 10" };

	String[] fechasNacimiento = { "1990-01-01", "1985-05-12", null, "1978-09-20", "2000-03-15", "1995-07-08", null,
			"1982-12-30", "1998-06-05", "2005-02-10" };

	String[] fechasMuerte = { "2021-02-28", null, "2010-10-15", "1995-11-03", null, "2008-06-20", "2015-04-12",
			"2020-08-25", null, "2012-12-01" };

	String[] nacionalidades = { "Nacionalidad Corta 1", "Nacionalidad Larga 2 con más palabras", null, "Nacionalidad 4",
			"Nacionalidad 5", "Nacionalidad 6", "Nacionalidad 7", null, "Nacionalidad 9 con más palabras",
			"Nacionalidad Corta 10" };

	String[] biografias = { "Biografía Corta 1", "Biografía 2 con más palabras y contenido interesante", null,
			"Biografía 4", "Biografía 5", "Biografía 6", "Biografía 7", "Biografía 8 con más contenido y detalles",
			"Biografía 9", "Biografía Corta 10" };

	String[] fotos = { "foto1.jpg", "foto2.png", null, "foto4.gif", "foto5.bmp", "foto6.jpg", "foto7.png", "foto8.jpeg",
			"foto9.gif", "foto10.bmp" };

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void autorestext() {
		for (int i = 0; i < fotos.length; i++) {
			driver.get("https://06.2daw.esvirgua.com/ProyectoMalaga/index.html");
			driver.manage().window().setSize(new Dimension(826, 666));
			driver.findElement(By.id("btnaltaautores")).click();
			driver.findElement(By.id("nombreInput")).click();
			driver.findElement(By.id("nombreInput")).sendKeys(nombres[i]);
			driver.findElement(By.id("fechanacimientoInput")).click();
			driver.findElement(By.id("fechanacimientoInput")).sendKeys(fechasNacimiento[i]);
			driver.findElement(By.id("fechafallecimientoInput")).click();
			driver.findElement(By.id("fechafallecimientoInput")).sendKeys(fechasMuerte[i]);
			driver.findElement(By.id("nacionalidadInput")).click();
			driver.findElement(By.id("nacionalidadInput")).sendKeys(nacionalidades[i]);
			driver.findElement(By.id("biografiaInput")).click();
			driver.findElement(By.id("biografiaInput")).sendKeys(
					biografias[i]);
			 try {

					driver.findElement(By.id("imagenautorInput")).click();
					driver.findElement(By.id("imagenautorInput")).sendKeys("C:\\fakepath\\" + fotos[i]);
				} catch (Exception e) {
//					InvalidArgumentException
				}
			driver.findElement(By.id("enviarautor")).click();
		}
	}
}
