package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ElementsPage 
{
	WebDriver driver;
	public ElementsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By elementsCard=By.xpath("//a[normalize-space()='Find Elements']");
	private By gitInput=By.name("username");
	private By imgElement=By.xpath("//img[@alt='User avatar']");
	private By username=By.xpath("//p[@class='title is-4']");
	private By repCountElement=By.xpath("//p[text()='Public Repos']/following-sibling::p[@class='title is-5']");
	private By repocarsCount=By.xpath("//div[@class='container mt-5']//article");
	
	public void clickOnElementCard()
	{
		driver.findElement(elementsCard).click();
	}
	
	public void enterGitUsername(String gitId)
	{
		driver.findElement(gitInput).sendKeys(gitId);
		driver.findElement(gitInput).sendKeys(Keys.ENTER);
	}
	public boolean isUserImagedisplayed()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(imgElement));
		return driver.findElement(imgElement).isDisplayed();
	}
	public void getUserName()
	{
		System.out.println("Username: "+driver.findElement(username).getText());
		
	}
	public void verifyRepoCountAndRepoCardCounts()
	{
		int repoCounttext = Integer.parseInt(driver.findElement(repCountElement).getText().trim());
		System.out.println("Public Repos Count Displayed: "+repoCounttext);
		
		int CardsCount = driver.findElements(repocarsCount).size();
		System.out.println("Repo cards displayed: "+CardsCount);
		
		Assert.assertEquals(CardsCount, repoCounttext,"Repo count is not matching");
		
	}
}
