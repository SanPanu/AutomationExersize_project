package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RadioAndCheckboxPage 
{
	WebDriver driver;
	WebDriverWait wait;
	public RadioAndCheckboxPage(WebDriver driver)
	{
		this.driver=driver;
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	private By togglecard=By.xpath("//a[normalize-space()='Toggle']");
	private By radio1=By.id("yes");
	private By radio2=By.xpath("//input[@id='one']");
	
	public void clcikOntogglecard()
	{
		driver.findElement(togglecard).click();
	}
	
	public void selelctOnRadio()
	{
		driver.findElement(radio1).click();
		
	}
	public void isOnlyOneradioisSelected()
	{
		List<WebElement> oneradio = driver.findElements(radio2);
		oneradio.get(0).click();
		Assert.assertTrue(oneradio.get(0).isSelected(), "Not selected");
		
		for(int i=1;i<oneradio.size();i++)
		{	
			Assert.assertTrue(oneradio.get(i).isSelected(),"More Than 1 radio is selected - failed");
		}
	}
	
}
