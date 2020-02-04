package harini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Proj 
{
	public static String dURL="http://www.youcandealwithit.com/";
	public static String[] fd = {"100","200","300"};
	public static String[] cl = {"10","20","30"};
	public static String[] shl = {"50","75","100"};
	public static String[] mp = {"500","100","400"};
	public static String[] mo = {"50","20","10"};
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(dURL);
	Actions act1 = new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"))).build().perform();
	driver.findElement(By.partialLinkText("Calculators & Resources")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Calculators")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Budget Calculator")).click();
	Thread.sleep(2000);
	
	
	for (int i = 0; i < 3; i++)
	{
	
	driver.findElement(By.id("food")).sendKeys(fd[i]);
	driver.findElement(By.id("clothing")).sendKeys(cl[i]);
	driver.findElement(By.id("shelter")).sendKeys(shl[i]);
	driver.findElement(By.id("monthlyPay")).sendKeys(mp[i]);
	driver.findElement(By.id("monthlyOther")).sendKeys(mo[i]);
	Thread.sleep(2000);
	
	String MExp = driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	System.out.println("Monthly Expense is " +MExp);
	String MInc = driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	System.out.println("Monthly Income is " +MInc);
	
	float ME = Float.parseFloat(MExp);
	float MI =  Float.parseFloat(MInc);
	
	if(ME<MI)
	{
		System.out.println("Warren Buffet");
	}
	else
	{
		System.out.println("poor savings");
	}
	
	System.out.println();
	
	driver.findElement(By.className("reset")).click();
	

	}
	
	Thread.sleep(4000);
	driver.quit();
	}
	
	
	 
}
