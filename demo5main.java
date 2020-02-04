package harini;

import java.io.IOException;
import java.util.Scanner;

public class demo5main {

	public static void main(String[] args) throws IOException 
	{

		Scanner scn = new Scanner(System.in);
		System.out.println("type the browser");
		String name = scn.nextLine();
		System.out.println(demo1.browser(name));
        System.out.println(demo1.close());
	}

}
