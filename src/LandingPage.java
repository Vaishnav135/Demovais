import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement userEmail= driver.findElement(By.id("userEmail"));

	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement Submit;
	
	
	public void loginApplication(String email, String password)
	
	{
		userEmail.sendKeys(email);
		userPassword.sendKeys(password);
		Submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client/");
		
		
	}
}
