package javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.ScrollAction;

public class scrollIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/Tamil_language");
		
		WebElement ele=driver.findElement(By.xpath("//h3//span[contains(text(),'Region-specific variations')]"));

		JavascriptExecutor js=(JavascriptExecutor) driver;		
		
		String box="arguments[0].scrollIntoView(true);";
		
		js.executeScript(box,ele);	
		

	}

}
