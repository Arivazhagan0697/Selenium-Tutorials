package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

		// 1)get the XY position
		WebElement getpositionbox = driver.findElement(By.id("position"));
		Point xypoint = getpositionbox.getLocation();
		int Xvalue = xypoint.getX();
		int Yvalue = xypoint.getY();
		System.out.println("The X value is : " + Xvalue);
		System.out.println("The Y value is : " + Yvalue);

		// 2)find the color
		WebElement colorbutton = driver.findElement(By.id("color"));
		String color = colorbutton.getCssValue("background-color");
		System.out.println("The color is :" + color);

		// 3)find the size
		WebElement sizebutton = driver.findElement(By.id("size"));
		int height = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		System.out.println("The Height is : " + height);
		System.out.println("The Width is :" + width);

		// 4)go to home page
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();

	}

}
