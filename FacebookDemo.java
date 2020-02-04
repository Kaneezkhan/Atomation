package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("xyz");
		driver.findElement(By.id("pass")).sendKeys("111");
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("Recover Your Account")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
