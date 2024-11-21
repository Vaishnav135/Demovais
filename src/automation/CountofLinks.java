package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.tagName("a")).getSize());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElement(By.tagName("a")).getSize());
		
		WebElement a = footer.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
		System.out.println(a.findElement(By.tagName("a")).getSize());
		
		
		
		
		
		
		
	}

}
