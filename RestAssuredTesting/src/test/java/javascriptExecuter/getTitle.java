package javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		JavascriptExecutor js=(JavascriptExecutor) driver;		
		
		String box="return document.title;";
		
		
		String run=js.executeScript(box).toString();
		System.out.println(run);
	

	}

}
