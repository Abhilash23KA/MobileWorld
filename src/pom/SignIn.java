package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {

@Test
public void signInMethod() {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilash.ka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(" https://mobileworld.banyanpro.com/");
		 LandingPage ob = new LandingPage(driver);
		 
		 ob.SignIn("Abhilash", "Abhi123");

	}

}
