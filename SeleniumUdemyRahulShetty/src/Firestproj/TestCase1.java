package Firestproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		
		// invoke the chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://google.com");
    
   System.out.println(driver.getTitle());// validate if your page title is corect
  // System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
   
   //System.out.println(driver.getPageSource()); //print page source
   
   driver.get("http://yahoo.com");
   driver.navigate().back();
	}

}
