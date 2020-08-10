package ActionAndframe;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultipleWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']")).click();
		System.out.println(driver.getTitle());
		
		//grab all the child wind ids
		Set<String> ids =driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator();
		String parentid =it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		// get back to parent window
		driver.switchTo().window(parentid);
	
	}

}
