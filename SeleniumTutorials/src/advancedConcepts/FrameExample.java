package advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();

		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();

		driver.switchTo().defaultContent();
		java.util.List<WebElement> totelframes = driver.findElements(By.tagName("iframe"));
		int size = totelframes.size();
		System.out.println("Totel no.of frames:"+ size);
	}

}
