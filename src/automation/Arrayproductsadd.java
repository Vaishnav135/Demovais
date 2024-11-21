package automation;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayproductsadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] itemsNeeded= {"Brocolli", "Cauliflower", "Cucumber" };
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement>products =driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++)
		{
			
			String name=products.get(i).getText();
			
			List<String> itemsNeededList =Arrays.asList(itemsNeeded);
		
			if(itemsNeededList.contains(name))
			{
				driver.findElement(By.cssSelector("//button[text()='ADD TO CART']")).click();
				
			}
		}
	
		
	}

}
