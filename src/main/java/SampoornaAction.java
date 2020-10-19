package main.java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampoornaAction {
	WebDriver driver;

	public void Login() {
		System.setProperty("webdriver.chrome.driver", "E:\\JAR\\DriversOfBrowsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.sampoorna.com/indexinterview.html");
		driver.findElement(By.xpath("//a[@title='Login or Register']")).click();
		WebElement pref = driver.findElement(By.xpath("//select[@name='cmbPrefix']"));
		Select select = new Select(pref);
		select.selectByValue("Mr");
		driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("Kailas");
		driver.findElement(By.xpath("//input[@title='Middle Name']")).sendKeys("Vaijanath");
		driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys("Andhalkar");

	}

	private void dropDown() {
		WebElement gender = driver.findElement(By.xpath("//select[@name='cmbGender']"));
		Select select = new Select(gender);
		select.selectByValue("Female");
		WebElement materialStatus = driver.findElement(By.xpath("//select[@name='cmbMaritialStatus']"));
		Select sel = new Select(materialStatus);
		sel.selectByValue("Single");

	}

	private void uploadFile() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='detailsHotText']")).click();
		driver.findElement(By.xpath("//input[@type='FILE']")).click();
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec("C:\\Users\\Kailas\\Desktop\\AutoIt\\Resume.exe");
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//td[@class='col-12 col-s-12 detailsNormalText']//input[@value='Upload Resume']"))
					.click();
		} catch (IOException e) {
			e.getClass();
		}

	}

}
