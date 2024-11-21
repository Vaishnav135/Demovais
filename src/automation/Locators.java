package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='radio1']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("india");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.className("inputs")).sendKeys("Vaishanv");
		System.out.println( driver.findElement(By.linkText("Open Window")).getText());
		
	}

}
