package mvnProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MvnClass {
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement viewDemo;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueB;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signIn;

	public MvnClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void viewDemo() {
		viewDemo.click();
	}
	public void email() {
		email.sendKeys("vish.vaishalithakre@gmail.com");
	}
	public void continueB() {
		continueB.click();
	}
	public void password() {
		password.sendKeys("Iwillwin@007");
	}
	public void signIn() {
		signIn.click();
	}
}
