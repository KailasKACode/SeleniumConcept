import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndAutomationonspicejet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAR\\DriversOfBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='AMD']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		WebElement p=driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
		p.click();
		int count=driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		for (int i = 0; i < count; i++) {
			String text=driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
			if(text.equals("30"))
			{
				driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
			}
		}

	}
}
