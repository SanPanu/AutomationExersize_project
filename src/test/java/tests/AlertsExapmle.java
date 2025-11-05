package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import base.Basetest;
import pages.AlertsPage;

public class AlertsExapmle extends Basetest
{
	
	@Test
	public void HandlingDifferentAlerts()
	{
		AlertsPage ap=new AlertsPage(driver);
		ap.clickAlertCard();
		ap.clcikAcceptAlert();
		
	}

}
