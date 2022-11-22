package javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/Tamil_language");

		JavascriptExecutor js=(JavascriptExecutor) driver;		
		
		String box="window.scrollTo(0,document.body.scrollHeight)";
		
		js.executeScript(box);
	}

}
