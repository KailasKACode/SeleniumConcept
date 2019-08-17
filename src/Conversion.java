import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conversion {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 150; i++) {
			//System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.onlineocr.net/");
			WebElement browse = driver.findElement(By.id("fileupload"));
			browse.sendKeys("//home//shashank//Downloads//RM-014//DATAFILE" + i + ".jpg");
			Select dropdown = new Select(driver.findElement(By.id("MainContent_comboOutput")));
			dropdown.selectByIndex(2);
			WebDriverWait wait = new WebDriverWait(driver, 25);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("MainContent_btnOCRConvert")));
			driver.findElement(By.id("MainContent_btnOCRConvert")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MainContent_lnkBtnDownloadOutput")));
			driver.findElement(By.id("MainContent_lnkBtnDownloadOutput")).click();
			Thread.sleep(3000);
			driver.close();
		}
	}
}
