package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		Actions a=new Actions(driver);
		WebElement d=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		a.moveToElement(d).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//Here build() is not compulsory to be written
	}
}
