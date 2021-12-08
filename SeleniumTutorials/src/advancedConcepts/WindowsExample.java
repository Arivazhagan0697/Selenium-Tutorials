package advancedConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");

		String oldwindow = driver.getWindowHandle();

		WebElement firstelement = driver.findElement(By.id("home"));
		firstelement.click();

		Set<String> handles = driver.getWindowHandles();

		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();

		driver.close();

		driver.switchTo().window(oldwindow);

		WebElement openmultiple = driver
				.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openmultiple.click();
		int numberofwindows = driver.getWindowHandles().size();
		System.out.println("No of windows opened : " + numberofwindows);

		WebElement dontcloseme = driver.findElement(By.id("color"));
		dontcloseme.click();

		Set<String> newwindowhandles = driver.getWindowHandles();
		for (String allwindows : newwindowhandles) {
			if (!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
		}
		driver.quit();
	}

}
