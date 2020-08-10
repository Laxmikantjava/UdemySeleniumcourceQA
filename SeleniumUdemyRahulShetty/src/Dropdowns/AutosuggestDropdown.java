package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	  driver.findElement(By.id("autosuggest")).sendKeys("ind");
	  Thread.sleep(8000);
	 List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
   for(WebElement option :options) {
	   option.getText().equalsIgnoreCase("India");
	   option.click();
	   break;
	   
   }
	 
	 
	}

}
