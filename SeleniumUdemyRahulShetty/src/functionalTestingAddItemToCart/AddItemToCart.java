package functionalTestingAddItemToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddItemToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String itemsNeeded[] = { "Cucumber", "Brocolli","Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);
		addItems(driver,itemsNeeded);
//explicit wait
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("locator")));
	}

	
	
	public static void addItems(WebDriver driver,String itemsNeeded[]) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual name replace - 1 kg from product name

			int j = 0;

			// convert array into array list for easy search
			// check weather name you extracted is present in arraylist or not

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(name)) {
				j++;
				// add product to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}
}