package test.Demo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedLooop {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Categories")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		int cateGory =driver.findElements(By.xpath("/html[1]/body[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/a/div[1]/span[1]")).size();
		int fullMenu = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div/a")).size();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		for(int i=1;i<=cateGory; i++) {
			for(int j=1; j<=fullMenu; j++) {
			String menuSize = driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/a["+i+"]/div[1]/span[1]")).getText();
			String ale =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[1]/div["+j+"]/a")).getText();
			System.out.println("Catagory menu items " + menuSize +"SubmenuItems: "+ ale); 
					
			}	
		}
		
	//	driver.quit();

	}
}
/*public void iteratinTargetCirclegTopMenu() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aviji\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.target.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		int topMenu = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div/a")).size();
		for(int i=1; i<=topMenu; i++) {
			String ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div/a["+i+"]")).getText();
			//driver.navigate().back();
			System.out.println("Top Menu Items : "+ele);
		}
		driver.quit();
	}
 */
