package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select a  = new Select(dropdown);
		a.selectByVisibleText("Option1");
		System.out.println(a.getFirstSelectedOption().getText());
		
		a.selectByIndex(3);
		System.out.println(a.getFirstSelectedOption().getText());
		a.selectByValue("option1");
		System.out.println(a.getFirstSelectedOption().getText());
	}


	}


