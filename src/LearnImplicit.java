import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnImplicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.fb.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9665732659");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Godisgreat#@90");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		WebDriverWait d=new WebDriverWait(driver,15);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='_y-c']")));
		driver.findElement(By.xpath("//a[@class='_y-c']")).click();
		
		
		
	}
}
