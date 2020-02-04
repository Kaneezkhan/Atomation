package harini;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class demo1 
{
	public static WebDriver myD;
	public static String vURL;

	public static String abc() throws IOException
	{
		myD.manage().window().maximize();
		vURL="https://www.yahoo.com";
		myD.get(vURL);
		System.out.println("title is "+myD.getTitle());
		System.out.println("URL is "+myD.getCurrentUrl());
		String a = myD.getCurrentUrl();	
		
		if (a.equals(vURL))
		{
		return "true";
		}
		else
		{
		File scrFile = (File) ((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("C:\\Users\\slk\\Desktop\\harini file\\SS\\pic2.jpg"));
		return "false";	
		}
	}
	
	public static String browser(String name) throws IOException 
	{
		
		if(name.equals("chrome"))	
		{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe" );
		myD = new ChromeDriver();
		System.out.println(abc());
		return "browser opened";
		}
		
		else if(name.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Jars\\geckodriver.exe" );
		myD = new FirefoxDriver();
		System.out.println(abc());	
		return "browser opened";
		}
		
		else
		{
			System.out.println("invaild");
			return "browser didnot opened";
		}
		
	}
	
	
	public static String close()
	{
		String flag="false";
		myD.close();
		flag="close function passed";
		return flag;
	}

	
}
	
	
	
	
	
