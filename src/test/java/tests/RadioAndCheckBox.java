package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import pages.RadioAndCheckboxPage;

public class RadioAndCheckBox extends Basetest
{
	
	@Test
	public void handleradioAndCheckBox() throws InterruptedException
	{
	
		RadioAndCheckboxPage rcp=new RadioAndCheckboxPage(driver);
		rcp.clcikOntogglecard();
		rcp.selelctOnRadio();
		rcp.isOnlyOneradioisSelected();
		
		
	}
	

}
