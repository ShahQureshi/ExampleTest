package test.Demo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TargetForloop {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Categories")).click();
		
		int menuSize = driver.findElements(By.xpath("/html[1]/body[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/a/div[1]/span[1]")).size();

		for (int i=1;i<menuSize; i++) {
			WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/a["+i+"]/div[1]/span[1]"));
			Actions a = new Actions(driver);
			a.moveToElement(ele);
			System.out.println(ele.getText());

		}
		driver.close();
	}

}
