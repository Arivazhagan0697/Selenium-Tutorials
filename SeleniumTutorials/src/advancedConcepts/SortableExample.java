package advancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));

		WebElement fromelement = elements.get(6);
		WebElement toelement = elements.get(0);

		Actions actions = new Actions(driver);
		actions.clickAndHold(fromelement);
		actions.moveToElement(toelement);
		actions.release(toelement);
		actions.build().perform();
	}

}
