package test.Demo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class msEdgeDriverBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Home Page Title:" + driver.getTitle());
		String url = driver.getCurrentUrl();
		System.out.println("The url is: " + url);
		driver.close();
	}

}
