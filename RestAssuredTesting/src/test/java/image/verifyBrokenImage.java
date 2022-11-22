package image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyBrokenImage {
	
	public void brokenImage() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		WebElement firstImage=driver.findElement(By.xpath("//section[@class='innerblock']//div[1]//div//div//img"));
		String naturalwidthoffirstImage=firstImage.getAttribute("naturalWidth");
		System.out.println("naturalwidthoffirstImage="+naturalwidthoffirstImage);
		
		WebElement brokenImage=driver.findElement(By.xpath("//section[@class='innerblock']//div[2]//div//div//img"));
		String naturalwidthofBrokenImage=brokenImage.getAttribute("naturalWidth");
		System.out.println("naturalwidthofBrokenImage="+naturalwidthofBrokenImage);
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verifyBrokenImage obj=new verifyBrokenImage();
		obj.brokenImage();
	}

}
