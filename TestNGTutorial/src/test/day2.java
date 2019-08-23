package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 extends day5 {

	
	
	
	@Test(groups={"Smoke"})
	public void ploan() throws IOException
	{
		System.out.println("good");
		// Login(); part of globalization 
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
