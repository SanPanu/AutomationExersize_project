package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleframesPage 
{
	WebDriver driver;
	public HandleframesPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By framesCard= By.xpath("//a[normalize-space()='Inner HTML']");
	private By nestedFrame= By.xpath("//iframe[@src='innerframe']");
	private By emailfield=By.name("email");
	private By emailenter=By.xpath("//input[@placeholder='Enter email']");
	private By nameField=By.xpath("//input[@placeholder='Enter name']");
	
	
	public void clcikFramesCard()
	{
		driver.findElement(framesCard).click();
	}
	public void enterdeatils(String names,String emails)
	{
		driver.findElement(nameField).sendKeys(names);
		driver.findElement(emailenter).sendKeys(emails);
	}
	public WebElement switchTonestedFrame()
	{
		return driver.findElement(nestedFrame);
	}
	public void enteremailinnestedFrame(String emailinNested)
	{
		driver.findElement(emailfield).sendKeys(emailinNested);
	}

}
