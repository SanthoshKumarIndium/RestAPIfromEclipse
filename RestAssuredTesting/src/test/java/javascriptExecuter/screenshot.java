package javascriptExecuter;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='SDkEP']"));
		String box="arguments[0].style.border='3px solid blue'";
		
		js.executeScript(box, ele);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Data\\Official\\Eclipse\\JavaScriptExecutor\\screenshot\\bug.jpeg"));

	}

}
