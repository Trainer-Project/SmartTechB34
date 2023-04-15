package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	// How to open a browser 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://automationexercise.com/login");
		driver.navigate().to("https://automationexercise.com/login");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//driver.close();
	    //driver.quit();
	}
}
