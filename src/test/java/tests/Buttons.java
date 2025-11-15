package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ButtonPage;

public class Buttons extends Basetest
{
	@Test
	public void clicking_differetn_Button()
	{
		ButtonPage bp=new ButtonPage(driver);
		bp.clickOnbuttonCard();
		bp.clcikOngoToHomeButton();
		bp.getXAndYcoordinatesOfButton();
		bp.HeightAndWidthOffindSizeButton();
		Assert.assertFalse(bp.Confirmbuttonisdisabled(),"Button should be disabled");
		bp.ClickandHoldTheButton();	
	}

}
