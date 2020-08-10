package ActionAndframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrame {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//html//frameset")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")));

	}

}
