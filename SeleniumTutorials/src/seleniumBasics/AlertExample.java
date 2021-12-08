package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32 new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");

		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox.click();

		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("I'm Prompt alert");
		promptalert.accept();
	}

}
