package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.DraggablePage;

public class DragTest extends Basetest
{
	@Test
	public void testDragFunctionality() throws InterruptedException
	{
		DraggablePage dp=new DraggablePage(driver);
		
		Thread.sleep(3000);
		
		dp.clickDragCard();
		
		int xBefore = dp.getDragbaleElement().getLocation().getX();
		int yBefore = dp.getDragbaleElement().getLocation().getY();
		
		dp.dragElement(150, 120);
		
		int xAfter = dp.getDragbaleElement().getLocation().getX();
		int yAfter = dp.getDragbaleElement().getLocation().getY();
		

	    Assert.assertNotEquals(xAfter ,xBefore, "X-axis not moved");
	    Assert.assertNotEquals(yAfter , yBefore, "Y-axis not moved");
		
	}
	

}
