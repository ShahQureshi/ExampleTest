package test.Demo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class LenovoBestBuy {
	
	WebDriver driver;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		if(driver.getTitle().contains("BestBuy")) {
			WebElement selectRole = driver.findElement(By.xpath("//select[@id='role']"));
			Select s = new Select(selectRole);
			s.selectByIndex(2);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdihabatol+1@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
			driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
						
			}
		    System.out.println("Homepage Title :" +driver.getTitle());
		 	int menuSize = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/a[1]/span[2]")).size();
			
			for(int i=1; i<=menuSize; i++) {
				String menuText = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div["+i+"]/div[1]/a[1]/span[2]")).getText();
				System.out.println(menuText);
		}
		
	}		
	
	public void closeBroser() {
		driver.quit();
	}

}
