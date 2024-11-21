package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz'] div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73'] div[class='css-1dbjc4n'] svg")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[6]/div[1]")).click();	
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]")).click();
		
		
		
		for(int i=0; i<4; i++)
		{
			driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();
			
		}
		
		for(int j=0; j<4; j++)
		{
			driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]")).click();
			
		}
		
		for(int k=0; k<4; k++)
		{
			driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]")).click();
			
		}
		
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebDriverWait d=new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		
		
		
	}

}
