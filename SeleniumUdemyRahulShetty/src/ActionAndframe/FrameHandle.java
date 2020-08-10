package ActionAndframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		Actions act = new Actions(driver);
       WebElement source= driver.findElement(By.id("draggable"));
       WebElement target= driver.findElement(By.id("droppable"));
        
       act.dragAndDrop(source, target).build().perform();
	}

}
