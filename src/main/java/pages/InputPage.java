package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InputPage 
{
	WebDriver driver;
	public InputPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	private By editInput=By.xpath("//a[normalize-space()='Edit']");
	private By enterFname=By.xpath("//input[@id='fullName']");
	private By appendText=By.xpath("//input[@id='join']");
	public By textPresent=By.xpath("//input[@id='getMe']");
	private By cleartext=By.xpath("//input[@id='clearMe']");
	private By disabledelement=By.xpath("//input[@id='noEdit']");
	private By readOnlyele=By.xpath("//input[@id='dontwrite']");
	
	public void inputPratice(String fullname,String apptext)
	{
		driver.findElement(editInput).click();
		driver.findElement(enterFname).sendKeys(fullname);
		driver.findElement(appendText).sendKeys(Keys.END+apptext+Keys.TAB);
		driver.findElement(cleartext).clear();
	}
	
	public String getTextPresent()
	{
		return driver.findElement(textPresent).getAttribute("value");
	}
	
	public boolean isFieldDisabled() 
	{
		return !driver.findElement(disabledelement).isEnabled();
		
	}
	public boolean isFieldReadOnly()
	{
		return driver.findElement(readOnlyele).getAttribute("readonly")!=null;
	}
	
}
