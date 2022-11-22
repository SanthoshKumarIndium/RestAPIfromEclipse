package javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightText {

	public void text() {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		JavascriptExecutor js=(JavascriptExecutor) driver;

		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));		
		String box="arguments[0].style.color = 'red'";

		js.executeScript(box, ele);

		//driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		highlightText obj= new highlightText();
		obj.text();

	}

}
