package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedIf_Mail 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("abcd");
		driver.findElement(By.id("password")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
