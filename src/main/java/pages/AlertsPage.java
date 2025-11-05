package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage 
{
	WebDriver driver;
	public AlertsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By alertCard=By.xpath("//a[normalize-space()='Dialog']");
	private By acceptAlert=By.id("accept");
	
	
	public void clickAlertCard()
	{
		driver.findElement(alertCard).click();
		
		
	}
	public void clcikAcceptAlert()
	{
		Alert al=driver.switchTo().alert();
		driver.findElement(acceptAlert).click();
		al.dismiss();
		System.out.println(al.getText());
		
	}
	

}
