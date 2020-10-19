package SeleniumConcept;

import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	public static WebDriver driver;
	public static Actions action;
	public static void main(String[] args) throws InterruptedException {
		openBrowserEnterUrl();
		getDate();
	}
	public static void openBrowserEnterUrl() {
		driver=new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
		
		Dimension n=new Dimension(50, 300);
	
		driver.manage().window().setSize(n);//to set dimension
		
		driver.manage().window().setPosition(new Point(500,100 ));//set position
		
		driver.manage().window().fullscreen();
		
	}
	
	public static void performRoundtrip() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys("Nagpur");
		Thread.sleep(2000);
	}
	
	public static void getDate() {
		Calendar cal = Calendar.getInstance();
		Date day = cal.getTime();
		System.out.println(day);
		cal.add(Calendar.DAY_OF_YEAR, 45);
		Date nextDate=cal.getTime();
		System.out.println(nextDate);
		System.out.println(nextDate.getDate());
		System.out.println(nextDate.getMonth()+1);
	}

}
