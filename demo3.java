package harini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{

	public static String vURL;
	
	public static void main(String[] args) 
	{
		vURL="https://in.yahoo.com";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.get(vURL);
		String a = myD.getCurrentUrl();
		myD.close();
if (a.equals(vURL))
{
	System.out.println("TC Pass");
}
else
{
	System.out.println("TC Fail");	
}
	}

}
