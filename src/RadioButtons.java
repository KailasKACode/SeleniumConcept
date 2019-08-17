import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		for (int i = 0; i < count; i++) {
			 String text=driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("id");
			//driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			 //If some one asked to select all the radio buttons
			 //This index is like an index number of array starting from 0
			 if(text.equals("RoundTrip"))
			 {
			 driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			 }
		}

	}
}
