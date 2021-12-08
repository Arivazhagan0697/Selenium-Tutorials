package advancedConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columcount = columns.size();
		System.out.println("Number of columns:" + columcount);

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowcount = row.size();
		System.out.println("Number of rows:" + rowcount);

		WebElement getpercent = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent = getpercent.getText();
		System.out.println("Percent is:" + percent);

		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberlist = new ArrayList<Integer>();

		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText().replace("%", "");
			numberlist.add(Integer.parseInt(individualvalue));
		}
		System.out.println("Final List : " + numberlist);

		int smallvalue = Collections.min(numberlist);
		System.out.println(smallvalue);

		String smallvaluestring = Integer.toString(smallvalue) + "%";
		System.out.println(smallvaluestring);

		String finalxpath = "//td[normalize-space()=" + "\"" + smallvaluestring + "\"" + "]//following::td[1]";
		System.out.println(finalxpath);
		// td[normalize-space()='30%']//following::td[1]
		WebElement check = driver.findElement(By.xpath("//td[normalize-space()='30%']//following::td[1]"));
		check.click();
	}

}
