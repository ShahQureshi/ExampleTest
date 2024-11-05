package test.Demo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AppointmentNow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\chromedriver.exe");
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(options);
		
		driver.get("https://appointment.ml-bench.com/");
		WebElement w = driver.findElement(By.xpath("//select[@id='role']"));
		Select selectRole = new Select(w);
		selectRole.selectByIndex(2);
		driver.findElement(By.id("email")).sendKeys("mdihabatol+1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("btnLogin")).click();
		int menuSize = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/a[1]/span[2]")).size();
		for (int i=0; i<menuSize; i++) {
			WebElement menuText = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div["+i+"]/div[1]/a[1]/span[2]"));
			System.out.println(menuText.getText());
;					}
		
		
		
		driver.close();		

	}

}
