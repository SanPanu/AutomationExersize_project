package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import base.Basetest;
import pages.WindowsPage;

public class Windows extends Basetest
{
	@Test
	public void handlingWindows()
	{
		WindowsPage wp=new WindowsPage(driver);
		wp.clickOnwindowscard();
		wp.clickOnhome();
		wp.switchtoNewWindow();
		
	}

}
