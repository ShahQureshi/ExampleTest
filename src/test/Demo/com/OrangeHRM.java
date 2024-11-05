package test.Demo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/a")).click();

		int menuSize = driver.findElements(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li/a[1]")).size();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		for (int i=1;i<menuSize; i++) {
			WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/ul[1]/li["+i+"]/a[1]"));
			Actions a = new Actions(driver);
			a.moveToElement(ele);
			System.out.println(ele.getText());
		}
		driver.close();
	}
}
