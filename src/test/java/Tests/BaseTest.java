package Tests;

import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public  static WebDriver driver;
	
 @BeforeSuite
 public void Initialiazation()  {
	 
	 WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/");	
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	}


@AfterSuite
public void tearDown() {
	driver.quit(); 
 }
}
