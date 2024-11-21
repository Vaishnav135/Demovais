package e2eFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("userEmail")).sendKeys("vais@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Vaishnav@1234");
		driver.findElement(By.id("login")).click();
		
	List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	WebElement prod =	products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
	prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		
		
	}

}
