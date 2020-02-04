package harini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Jars\\chromedriver.exe" );
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://in.yahoo.com");
		System.out.println("title is "+myD.getTitle());
		System.out.println("URL is "+myD.getCurrentUrl());
		myD.close();

	}

}
