package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.Basetest;
import pages.DropdownsPage;

public class Dropdowns extends Basetest
{
	
	@Test
	public void handlingDifferentDropdowns()
	{
		DropdownsPage dp=new DropdownsPage(driver);
		dp.clickOnDropdownCard();
		dp.selectFruitsDropdown("Orange");
		dp.selelctCountryDropdown("India");
		
	}

}
