package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {

	static WebDriver driver;

	@BeforeSuite
	public void launchingFireFox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91737\\Desktop\\Selenium Jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Passed...!");
		} else {
			System.out.println("Failed...!");
		}
		driver.quit();
	}

	@AfterSuite
	public void launchingChrome() {
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\91737\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		// ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		String title = driver.getTitle();
		if (title.equals("bing")) {
			System.out.println("Passed...!");
		} else {
			System.out.println("Failed...!");
		}
		driver.quit();
	}

	@Test
	public static void main(String[] args) {

		OpenGoogle google = new OpenGoogle();
		google.launchingFireFox();
		google.launchingChrome();
		driver.quit();
	}

}
