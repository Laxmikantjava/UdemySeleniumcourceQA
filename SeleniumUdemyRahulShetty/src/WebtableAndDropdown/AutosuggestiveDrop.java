package WebtableAndDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDrop {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.click();
		source.sendKeys("mum");
		Thread.sleep(3000);
		source.sendKeys(Keys.ENTER);
		
		
		WebElement Destination = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		Destination.click();
		Destination.sendKeys("del");
		Thread.sleep(3000);
		Destination.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(Keys.ENTER);
	}

}
