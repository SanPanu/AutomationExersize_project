package tests;

import org.testng.annotations.Test;


import pages.DragElementToTarget;

public class DragAndDropElementToTarget extends Basetest
{
	@Test
	public void DrandAndDroptheElement() throws InterruptedException
	{
		DragElementToTarget DT=new DragElementToTarget(driver);
		DT.clickDropCard();
		DT.dragAndDropTheElement();
		Thread.sleep(4000);
	
	}

}
