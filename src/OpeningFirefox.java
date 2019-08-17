import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpeningFirefox {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","//home//shashank//Downloads//Compressed//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.onlineocr.net/");
		WebElement browse =driver.findElement(By.id("fileupload"));
		browse.sendKeys("//home//shashank//Downloads//RM-014//DATAFILE26.jpg");
		Select dropdown = new Select(driver.findElement(By.id("MainContent_comboOutput")));
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("#MainContent_btnOCRConvert")).submit();
		//Boolean isPresent = driver.findElements(By.cssSelector("#MainContent_btnOCRConvert")).size() > 0;
		//System.out.println(isPresent);
		driver.findElement(By.id("MainContent_lnkBtnDownloadOutput")).click();


	}
}
