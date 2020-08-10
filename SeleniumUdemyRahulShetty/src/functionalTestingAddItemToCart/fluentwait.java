package functionalTestingAddItemToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fluentwait {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();// chromedriver is claas which is implementing webdriver interface
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	}

}
