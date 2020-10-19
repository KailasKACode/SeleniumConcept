package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.runtime.Timeout;

public class MouseMovement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.durgasoft.com/index.asp");
		//Thread.sleep(3000);
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@src='close.png']"))));
		driver.findElement(By.xpath("//img[@src='close.png']")).click();


	}
}
