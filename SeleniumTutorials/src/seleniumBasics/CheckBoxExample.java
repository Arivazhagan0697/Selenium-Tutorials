package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");

		WebElement java = driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();

		WebElement selenium = driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div"));
		boolean seleniumselected = selenium.isSelected();
		System.out.println(seleniumselected);

		WebElement firstelement = driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if (firstelement.isSelected()) {
			firstelement.click();
		}
		WebElement secondelement = driver.findElement
				(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if (secondelement.isSelected()) {
			secondelement.click();
		}
	}

}
