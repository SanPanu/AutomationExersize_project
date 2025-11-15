package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.HandleframesPage;

public class FramesExample extends Basetest
{
	
	@Test
	public void handleframes() throws InterruptedException
	{
		HandleframesPage hp=new HandleframesPage(driver);
		hp.clcikFramesCard();
		driver.switchTo().frame("firstFr");
		hp.enterdeatils("Sangamesh", "test@gmail.com");
		driver.switchTo().frame(hp.switchTonestedFrame());//same frame method passed webelement
		hp.enteremailinnestedFrame("test@gmail.com");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		
	}

}
