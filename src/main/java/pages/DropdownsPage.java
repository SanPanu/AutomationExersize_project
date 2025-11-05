package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownsPage 
{
	WebDriver driver;
	WebDriverWait wait;
	public DropdownsPage(WebDriver driver)
	{
		this.driver=driver;
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	private By DropdownCard=By.xpath("//a[normalize-space()='Drop-Down']");
	private By fruitsDropdown=By.id("fruits");
	private By countryDropdown=By.id("country");
	
	public void clickOnDropdownCard()
	{
		wait.until(ExpectedConditions.elementToBeClickable(DropdownCard)).click();
	}
	
	public void selectFruitsDropdown(String fruit)
	{
		Select sel=new Select(driver.findElement(fruitsDropdown));
		sel.selectByVisibleText(fruit);
	}
	public void selelctCountryDropdown(String cntry)
	{
		Select sel1=new Select(driver.findElement(countryDropdown));
		sel1.selectByValue(cntry);
		String slectedCountry = sel1.getFirstSelectedOption().getText();
		System.out.println("Selected Country is : "+slectedCountry);
		
		
	}

}
