package javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightelement {
	
	public void highlight() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");

		JavascriptExecutor js=(JavascriptExecutor) driver;

		//WebElement ele=driver.findElement(By.xpath("//div[@class='SDkEP']"));
		WebElement ele=driver.findElement(By.xpath("//div[@class='L3eUgb']"));
		String box="arguments[0].style.backgroundColor='rgb(212,209,221)'";		
		
		js.executeScript(box, ele);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		highlightelement obj=new highlightelement();
		obj.highlight();
	}

}
