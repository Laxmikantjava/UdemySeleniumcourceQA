package CheckboxAndEndToEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentClearTrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//// a[contains(@class,'ui-state-default ui-state-highlight')]
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();

		Select adultsdrop = new Select(driver.findElement(By.id("Adults")));
		adultsdrop.selectByValue("2");

		Select childsdrop = new Select(driver.findElement(By.id("Childrens")));
	 	childsdrop.selectByValue("1");

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		Thread.sleep(2000);

		Select TravelClassdrop = new Select(driver.findElement(By.id("Class")));
		TravelClassdrop.selectByValue("Business");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("IndiGo");

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
