package Firestproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse data\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://salesforce.com/");
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']")).click();
	    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("sdetqa");
	    driver.findElement(By.cssSelector("[input[id='password']]")).sendKeys("javasdet");
	    driver.findElement(By.cssSelector("input.signinbtn")).click();
	    
	    

	}

}
