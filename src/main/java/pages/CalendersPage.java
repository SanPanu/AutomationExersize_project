package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendersPage 
{
	WebDriver driver;
	public CalendersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By calendersCard = By.xpath("//a[normalize-space()='Date & Time']");
	private By birthDayClaender=By.id("birthday");
	

}
