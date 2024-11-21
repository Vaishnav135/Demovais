package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000L);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();
		Thread.sleep(5000L);
		
		
		WebElement a = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin'] //div[@class='r-1862ga2 r-1loqt21 r-1i10wst r-tceitz r-u8s1d css-76zvg2']"));
		Thread.sleep(5000L);
		a.click();
		Thread.sleep(5000L);
		a.sendKeys("Mumbai");
	}

}
