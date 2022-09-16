package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class order {
	@Test
	public void orderMethod(){
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\abhilash.ka\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(" https://mobileworld.banyanpro.com/");
		   LandingPage ordr = new LandingPage(driver);
		      ordr.Order("abhilash","k a","abhilash@gmail.com", "abhilash123", "123456789","Sai shiva homes", "Nagawara","Bangalore", "5464789654", "1", "3");
		   

	}

}
