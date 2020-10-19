package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("SauceDemo.com");
		driver.findElement(By.xpath("(//img[@alt='Bookmark and Share'])[1]")).click();
		driver.switchTo().alert().accept(); //This is to switch to the pop up and ok as accept as it is not html code
		driver.switchTo().alert().dismiss(); // This is to not accept the agremment on pop up which is non html code
		//driver.switchTo().alert().getText();
		//driver.switchTo().alert().sendKeys("Hi");
	}
}
