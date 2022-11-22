package javascriptExecuter;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('Na Google')");
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();		
		
		driver.close();

	}

}
