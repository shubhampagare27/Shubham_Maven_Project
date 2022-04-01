package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	@FindBy(id="txtUsername")
	private WebElement useranme;
	
	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='btnLogin']")
	private WebElement loginButton;
	
	
	@FindBy(xpath="//a[@id=\'welcome']")
	private WebElement welcomebutton;
	
	
	
	@FindBy(xpath="//div//ul//li[3]/a[1]")
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
		welcomebutton.click();
		Thread.sleep(3000);
		logoutbutton.click();
		
	}
}
