package advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");

		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> optionslist = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(optionslist.size());
		for (WebElement webElement : optionslist) {
			if (webElement.getText().equals("Web Services")) {
				webElement.click();
				System.out.println("if part");
				break;
			} else {
				System.out.println("else part");
			}
		}
	}

}
