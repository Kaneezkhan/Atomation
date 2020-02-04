package harini;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
		/* implicit means if there a error then it takes the given time.. 
		 * if there is no struggle to execute the statement then it does not wait */
									
		WebDriverWait wait = new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help"))); 
		// Explicitly waiting for this particular statement (above) to be executed.
		driver.findElement(By.linkText("Help")).click(); 

	}

}
