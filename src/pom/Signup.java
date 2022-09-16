package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signup {

	@Test
	public void signUpMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilash.ka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get(" https://mobileworld.banyanpro.com/");
	   LandingPage sup = new LandingPage(driver);
        sup.SignUp("Abhilash","K A","Abhilashka@gmail.com","Abhi987","01/02/1998","9480284891","i am indian");
		   	}

}
