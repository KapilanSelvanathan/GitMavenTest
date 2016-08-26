import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
			
	}
	@Test
	public void doLogin() {
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("kapilan_ww@yahoo.com");
		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("lol");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		
			
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();		
	}
}