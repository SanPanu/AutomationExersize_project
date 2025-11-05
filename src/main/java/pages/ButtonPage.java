package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonPage 
{
	WebDriver driver;
	public ButtonPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By buttonCard=By.xpath("//a[normalize-space()='Click']");
	private By goToHomeButton=By.id("home");
	private By findLocationButton=By.id("position");
	private By findSizeButton=By.id("property");
	private By disbaledButton=By.id("isDisabled");
	private By clickHoldbutton=By.xpath("//h2[normalize-space()='Button Hold!']");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	public void clickOnbuttonCard()
	{
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(buttonCard))).click();
	}
	public void clcikOngoToHomeButton()
	{
		driver.findElement(goToHomeButton).click();
		driver.navigate().back();
	}
	public void getXAndYcoordinatesOfButton()
	{
		WebElement locationButton = driver.findElement(findLocationButton);
		int XCoordinate = locationButton.getLocation().getX();
		int YCoordinate = locationButton.getLocation().getY();
		System.out.println(XCoordinate+"  "+YCoordinate);
	}
	public void HeightAndWidthOffindSizeButton()
	{
		WebElement findSizeButtonelement = driver.findElement(findSizeButton);
		int height = findSizeButtonelement.getSize().getHeight();
		int width = findSizeButtonelement.getSize().getWidth();
		System.out.println(height+" "+width);
		
	}
	public boolean Confirmbuttonisdisabled()
	{
		return driver.findElement(disbaledButton).isEnabled();
	}
	public void ClickandHoldTheButton()
	{
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(clickHoldbutton)).perform();;
	}
}
