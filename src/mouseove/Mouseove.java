package mouseove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\javafiles\\chromedriver\\chromedriver3.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=11618924598846668360&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007785&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		Actions a = new Actions(driver);
		
	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		
		
	}

}
