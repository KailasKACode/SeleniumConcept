package SeleniumConcept;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {
	public static void main(String[] args) {
		String url = "";
		
		HttpURLConnection huc = null;
		int respCode = 200;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kailas\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Active links:  " + links.size());
		
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			System.out.println("URL  " + url);

		}
		if (url == null || url.isBlank() || url.isEmpty()) {
			System.out.println("URL is either not configured for anchor tag or it is empty");

		}
		try {
			huc = (HttpURLConnection) (new URL(url).openConnection());

			huc.setRequestMethod("HEAD");

			huc.connect();

			respCode = huc.getResponseCode();

			if (respCode >= 400) {
				System.out.println(url + " is a broken link");
			} else {
				System.out.println(url + " is a valid link");
			}

		} catch (Exception e) {
	
			e.printStackTrace();

		}

	}
}
