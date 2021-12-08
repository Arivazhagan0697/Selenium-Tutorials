package advancedConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91737\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");

		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		
		File fileLocation = new File("C:\\Users\\91737\\Downloads");
		File[] totalfiles = fileLocation.listFiles();
		
		for (File file : totalfiles) {
			
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is Downloaded");
				break;
			}
		}
	}

}
