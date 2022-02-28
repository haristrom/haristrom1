package Selinium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlauch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\" + "Selinium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com/maps");

		driver.navigate().to("https://www.olacabs.com/");

		driver.navigate().to("https://www.youtube.com/");

		driver.navigate().back();
		driver.navigate().forward();

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		driver.navigate().refresh();
		driver.close();

	}
}
