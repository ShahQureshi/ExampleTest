package test.Demo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class BasicClass {
	//Below we are inovking the WebDriver
	WebDriver driver;

	public void openBrowser() {
		//Below we are setting the properties of our ChromeDriver.
		//key for chrome driver will always be same
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srq10\\eclipse-workspace\\WednesdayProject\\src\\Lib\\chromedriver.exe");
		ChromeOptions  options = new ChromeOptions ();
		options.setAcceptInsecureCerts(true);
		
		//Below we are setting the driver variable to ChromeDriver.
		driver = new ChromeDriver(options);
		//Below we are lanunching the ChromeDriver to go to a site.
		driver.get("https://appointment.ml-bench.com/");
		// we will proivde the DOM few seconds to load all the elements.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Below we will maximize our browser window.
		driver.manage().window().maximize();
		
		//Below we are goiing to validate that we ar on the right page befor logging in.
		//If method
		if(driver.getTitle().contains("Appt")) {
			//Below we are using webElement as a data type to store the locator for the select role.
			WebElement selectRole = driver.findElement(By.xpath("//select[@id='role']"));
			//Below we are creating a object for the Select class to be able to use all the methods from it.
			Select s = new Select(selectRole);
			//Below we are itarating the roles and selecting the role based on the index number.(index Number starts with 0)
			s.selectByIndex(2);
			//Below we are clicking the email box and entering the email address using the sendKeys method.
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mdihabatol+1@gmail.com");
			//Below we are clicking the password box and entering the password using sendKeys mehtod.
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
			//Below we are clicking the signing in button signin.
			driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
			
			System.out.println("Homepage Title :" +driver.getTitle());
			
			//Below we are using For Loop to iterate through left hand menu to get the text of all the menu items.
				int menuSize = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/a[1]/span[2]")).size();
				
				for(int i=1; i<=menuSize; i++) {
					String menuText = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div["+i+"]/div[1]/a[1]/span[2]")).getText();
					System.out.println(menuText);
			}
				                                             
		}
		
		}
	


	public void closeBroser() {
		// we will use the quit method to close the browser instance we previously opened. 
		driver.quit();

	}



}
