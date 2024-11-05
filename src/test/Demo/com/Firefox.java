package test.Demo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Home Page Title:" + driver.getTitle());
		driver.close();

	}

}
