package test.Demo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yahoo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//header/div[@id='module-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/ul[1]/li[4]/button[1]/span[1]"))).build().perform();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		int fullMenu = driver.findElements(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]d/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/ul[1]/li[4]/div[1]/ul[1]/li[1]/ul[1]/li/a[1]")).size();
		for(int i=1; i< fullMenu; i++) {
		String menuSize = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/ul[1]/li[4]/div[1]/ul[1]/li[1]/ul[1]/li["+i+"]/a[1]")).getText();
		System.out.println(menuSize);
		}
		
		

	}

}
