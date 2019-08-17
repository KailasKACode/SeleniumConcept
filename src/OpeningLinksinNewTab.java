import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningLinksinNewTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement p = driver.findElement(By.xpath("//td[1]//ul[1]"));
		int c = p.findElements(By.tagName("a")).size();
		System.out.println(c);
		for (int i = 0; i < c; i++) {
			String onClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			p.findElements(By.tagName("a")).get(i).sendKeys(onClick);
			Thread.sleep(5000);
		}
		Set<String> k = driver.getWindowHandles();
		Iterator<String> it = k.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
}
