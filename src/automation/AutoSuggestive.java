package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).click();
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		List<WebElement> options = driver.findElements(By.id("autosuggest"));
		for(WebElement option :options)
		{
			
			if(option.getText().equalsIgnoreCase("India"))
				option.click();
			break;
		}
	}

}
