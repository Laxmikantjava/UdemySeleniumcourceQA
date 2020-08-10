import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		// switch bacl to parent window

		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

}
