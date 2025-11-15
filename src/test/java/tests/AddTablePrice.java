package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.WebTableSortingPage;

public class AddTablePrice extends Basetest
{
	@Test
	public void getPrice() throws InterruptedException
	{
		WebTableSortingPage wt=new WebTableSortingPage(driver);
		Thread.sleep(2000);
		wt.clickOnTableCard();
		Thread.sleep(2000);
		Assert.assertEquals(wt.actPrice(), wt.addAllTheItemsPrice(),"Price Not matching");
		Thread.sleep(2000);
		wt.markPresentByLastName("Raj");
		Thread.sleep(2000);
		wt.sortCalories();
		Thread.sleep(2000);
	}

}
