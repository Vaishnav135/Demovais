package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Vaishnav");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9324148351");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		driver.findElement(By.className("go-to-login-btn")).click();
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("vais@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxTwo")).click();		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("p")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");	
	}
	
}
