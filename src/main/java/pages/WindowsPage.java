package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage 
{
	WebDriver driver;
	public WindowsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By windowscard=By.xpath("//a[normalize-space()='Tabs']");
	private By home=By.id("home");
	
	public void clickOnwindowscard()
	{
		driver.findElement(windowscard).click();
	}
	public void clickOnhome()
	{
		driver.findElement(home).click();
	}
	
	
	public void switchtoNewWindow()
	{
		String parentwindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String ch:childWindow)
		{
			if(!ch.equals(parentwindow))
			{
				driver.switchTo().window(ch);
			}
			
		}
		System.out.println(driver.getTitle());

	}

}
