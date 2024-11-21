package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownForWhileloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000L);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		Thread.sleep(3000L);
		
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
		Thread.sleep(3000L);
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
		Thread.sleep(5000L);
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();
		driver.close();
	}

}
