package harini;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		myprint(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set <String> id = driver.getWindowHandles();
		Iterator <String> it = id.iterator();
		String vPar = it.next();
		String vCh1 = it.next();
		driver.switchTo().window(vCh1);
		myprint(driver.getTitle());
		
		driver.findElement(By.linkText("Community")).click();
		//String vCh2 = it.next();           /* if community was next web page
		//driver.switchTo().window(vCh2);			then , use this */
		myprint(driver.getTitle());
		driver.quit();
	}

	 static void myprint(String vStr)
	 {
		System.out.println(vStr);
		
	}

}
