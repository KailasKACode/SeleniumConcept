package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		Select l=new Select(driver.findElement(By.id("month")));
		l.selectByIndex(2);
		l.deselectByVisibleText("Jan");
		l.selectByValue("3");
		l.deselectAll();
		//After deselecting you cannot reselect
	}
}
