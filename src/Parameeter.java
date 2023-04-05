import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parameeter {
	
	WebDriver driver=new ChromeDriver();
	SoftAssert ass =new SoftAssert();
	
	@BeforeTest
	public void mySetup () {
		driver.get("https://www.google.com");

		
	}
	
	

}
