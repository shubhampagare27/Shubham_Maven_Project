package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// hii this is shubham's code
public static WebDriver driver;
	// finding the webelement on webpage.
	@FindBy(name="username")
	private WebElement useranme;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginButton;
	
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement profile;
	
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pass) throws InterruptedException {
		
		useranme.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
		Thread.sleep(3000);
		profile.click();
		Thread.sleep(3000);
		logoutbutton.click();
		
	}
}
