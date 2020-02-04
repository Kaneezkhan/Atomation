
package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		//driver.findElement(By.className("nav-action-inner")).click();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fossil watches for men");
		//driver.findElement(By.className("nav-input")).sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[6]/div/span/div/div/span/a/div/img")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.partialLinkText("Back to results")).click();
		//driver.findElement(By.xpath("//*[text()='Fossil']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[contains(text(),'Gen 5')]")).click();
		//driver.findElement(By.xpath("(//*[contains(text(),'Gen 5')])[2]")).click();
		
		driver.findElement(By.xpath("//*[contains(@id,'twotabs')]")).sendKeys("abcd");
		
		Thread.sleep(3000);	
		driver.quit();
	}


}
