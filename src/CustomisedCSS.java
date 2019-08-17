import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		// Customised xpath and css used here
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sb");
		driver.findElement(By.cssSelector("*[id*='pass']")).sendKeys("abc");
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input#u_0_2")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
		// Customised xpath with parent and child relationship.
		driver.findElement(By.xpath("//div[@class='_xkv']/a")).click();
		
	}
}
