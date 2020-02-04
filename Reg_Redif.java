package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Reg_Redif 
{
public static String vURL="https://register.rediff.com/register/register.php?FormName=user_details";
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(vURL);
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("hari");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("hari@123");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("987");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("987");	
		Thread.sleep(2000);	
		driver.findElement(By.className("nomargin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='f']")).click();	
		Thread.sleep(2000);
		
		Select sel1 = new Select(driver.findElement(By.id("country")));
		sel1.selectByIndex(1);
		Thread.sleep(2000);
		sel1.selectByValue("197");
		Thread.sleep(2000);
		sel1.selectByVisibleText("India");
		
		Select sel2 = new Select(driver.findElement(By.xpath("//select[contains(@name,'city')]")));
		sel2.selectByVisibleText("Agra");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@src=\'https://register.rediff.com/utilities/newforgot/img/darrow_country.png\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='United Kingdom (+44)']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
