

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();

		
		LandingPage landingpage = new LandingPage(driver); 
		landingpage.goTo();
		landingpage.loginApplication("vais@gmail.com", "Vaishnav@1234");
		driver.manage().window().maximize();
		
		
		String Name= "ADIDAS ORIGINAL";
		
	
		driver.findElement(By.id("login")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(Name)).findFirst().orElse(null);
		
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		List<WebElement> productcart = driver.findElements(By.cssSelector(".cartSection h3"));
		
		Boolean match = productcart.stream().anyMatch(productcarts->productcarts.getText().equalsIgnoreCase(Name));
		System.out.println(match);
		
		driver.findElement(By.cssSelector("li[class='totalRow'] button[type='button']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[placeholder='Select Country']"))));
		
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
		
		driver.findElement(By.xpath("(//button[contains(@class, 'ta-item')]) [2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Checkout')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		
		
		
	}
	
	
	
}
