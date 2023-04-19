package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	static WebDriver driver;
	// How to open a browser 
	public static void main(String[] args) {	
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new ChromeDriver();  //Up casting 
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
