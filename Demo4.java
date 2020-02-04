package harini;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 
{
	public static WebDriver myD;
	public static String URL;

	public static String abc()
	{
		myD.manage().window().maximize();
		URL="https://www.google.com/";
		myD.get(URL);
		System.out.println("title is "+myD.getTitle());
		System.out.println("URL is "+myD.getCurrentUrl());
		String a = myD.getCurrentUrl();	
		myD.close();
		
		
		if (a.equals(URL))
		{
		return "true";
		}
		else
		{
		return "false";	
		}
		
	}
	public static void xyz()
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("type the browser");
	String name = scn.nextLine();
	
		if(name.equals("chrome"))	
		{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe" );
		myD = new ChromeDriver();
		String res= abc();
		System.out.println(res);
	
		}
		
		else if(name.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe" );
		myD = new FirefoxDriver();
		String res= abc();
		System.out.println(res);
	
		}
		
		else
		{
			System.out.println("invaild");
		}
	
	  }
	

public static void main(String[] args) 
{
	xyz();
}

}




