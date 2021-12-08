package advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");

		WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
		homepagelink.click();

		driver.navigate().back();

		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
		String where = wheretogo.getAttribute("href");
		System.out.println("This link is going to:" + where);

		WebElement brokenlink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenlink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("This link is broken");
		} else {
			System.out.println("This link is not broken");
		}

		driver.navigate().back();
		//  stale element reference: element is not attached to the page document
		
		WebElement homepagelink1 = driver.findElement(By.linkText("Go to Home Page"));
		homepagelink1.click();

		List<WebElement> totallink = driver.findElements(By.tagName("a"));
		int linkcount = totallink.size();
		System.out.println("Total Counts:" + linkcount);

	}

}
