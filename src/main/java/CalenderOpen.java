package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderOpen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement p=driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']"));
		p.click();
		int count=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td")).size();
		for (int i = 0; i < count; i++) {
			String text=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td")).get(i).getText();
			if(text.equals("30"))
			{
				driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td")).get(i).click();
			}
		}
	}
}