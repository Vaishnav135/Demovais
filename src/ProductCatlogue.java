import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponent;

public class ProductCatlogue extends AbstractComponent {

	
	WebDriver driver;
	
	public ProductCatlogue(WebDriver driver)
	
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="mb.3")
	List<WebElement> products;
	
	By ProductsBy =By.cssSelector("mb.3");
	
	public List<WebElement> getProductList()
	{
		
		waitForElementToAppear(ProductsBy);
		return products;
	}
	
	public WebElement getProductByName(String ProductName)
	
	{
		
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(ProductName)).findFirst().orElse(null);
		return prod;
	}
	
}
