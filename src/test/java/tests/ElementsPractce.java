package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basetest;
import pages.ElementsPage;

public class ElementsPractce extends Basetest
{
/*	Type and Enter your Git username
	Assert that user has image
	Print the user name & other informations
	Assert that no.of public repositories are listed correctly
	eg. if Public Repos has 10 then in the list 10 links should be available
	 */
	@Test
	public void verifyGitHubUser()
	{
		ElementsPage ep=new ElementsPage(driver);
		ep.clickOnElementCard();
		ep.enterGitUsername("Psangamesh");
		Assert.assertTrue(ep.isUserImagedisplayed(), "User Image not displayed");
		ep.getUserName();
		ep.verifyRepoCountAndRepoCardCounts();
	}

}
