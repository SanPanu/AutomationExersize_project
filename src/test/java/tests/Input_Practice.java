package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.Assert;

import pages.InputPage;

public class Input_Practice extends Basetest
{
	@Test
	public void input()
	{
		InputPage ip=new InputPage(driver);
		ip.inputPratice("Sangamesh", "Text Added");
		AssertJUnit.assertEquals(ip.getTextPresent(),"ortonik","Not Found correct text");
		Assert.assertTrue(ip.isFieldDisabled(), "Field should be disabled");
		Assert.assertTrue(ip.isFieldReadOnly(), "Field should be read only");
	}

}
