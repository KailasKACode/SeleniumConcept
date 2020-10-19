package main.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdowns {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com");
		WebElement p=driver.findElement(By.xpath("//div[@class='_2CU_']/input"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.clear();
		p.sendKeys("air");
		p.sendKeys(Keys.ARROW_DOWN);
		p.sendKeys(Keys.ENTER);
	}
}
