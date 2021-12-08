package advancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");

		WebElement calender = driver.findElement(By.id("datepicker"));
	    calender.sendKeys("09/10/2020" + Keys.ENTER);

		/*calender.click();
		WebElement nextbutton = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span"));
		nextbutton.click();

		WebElement datetobegiven = driver
				.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[7]/a"));
		datetobegiven.click();*/
	}

}
