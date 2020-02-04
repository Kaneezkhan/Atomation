package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vturesource.com/vtu-cbcs-results/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter USN']")).sendKeys("123");
		Thread.sleep(5000);
		driver.close();

	}

}
