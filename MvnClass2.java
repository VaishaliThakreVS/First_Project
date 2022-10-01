package mvnProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MvnClass2 
{
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	@FindBy(xpath="//input[@value='Go']")
	private WebElement go;
	@FindBy(xpath="//span[@id='nav-cart-count']")
	private WebElement cart;
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement acctList;
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signOut;
	
	public MvnClass2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	public void search() {
		search.click();
		search.sendKeys("Laptop");
	}
	public void go() {
		go.click();
	}
	public void cart() {
		cart.click();
	}
	public void acctList(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(acctList).perform();
		act.moveToElement(signOut).click().build().perform();
	}
}
