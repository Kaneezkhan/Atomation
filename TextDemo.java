package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextDemo 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		String vSearch="Testing";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(vSearch);
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Images")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Software Testing Professionals")).click();
		Thread.sleep(6000);	
//		String b = driver.findElement(By.name("q")).getAttribute("value");
//		System.out.println(b);
//		
//		if(vSearch.equals(b))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		driver.quit();
	}

}
