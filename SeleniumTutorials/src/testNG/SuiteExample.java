package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in");
	}

	@Test
	public void openBing() {
		driver.get("https://www.bing.com");
	}

	@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.com");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken: " + totalTime);
	}
}
