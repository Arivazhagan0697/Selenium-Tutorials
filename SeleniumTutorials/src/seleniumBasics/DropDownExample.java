package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		// dd using index
		select.selectByIndex(3);
		// Thread.sleep(3000);
		// dd using text
		select.selectByVisibleText("Loadrunner");
		// dd using value
		select.selectByValue("2");

		// get the no of options
		List<WebElement> listofoptins = select.getOptions();
		int size = listofoptins.size();
		System.out.println("No of Elements : " + size);

		// using sendkeys to select
		dropdown1.sendKeys("Appium");

		// select multiple options
		WebElement multiselect = driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectbox = new Select(multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
	}

}
