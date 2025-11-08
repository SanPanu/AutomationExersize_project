package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragElementToTarget 
{
	WebDriver driver;
	public DragElementToTarget(WebDriver driver)
	{
		this.driver=driver;
		
	}
	private By DropCard=By.xpath("//a[@href='/droppable']");
	private By dragbleEle=By.id("draggable");
	private By dropableEle=By.id("droppable");
	
	public void clickDropCard()
	{
		driver.findElement(DropCard).click();
	}
	public void dragAndDropTheElement()
	{
		WebElement source = driver.findElement(dragbleEle);
		WebElement target =driver.findElement(dropableEle);
		
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveToElement(target).pause(Duration.ofSeconds(1)).release().build().perform();
		
	}

}
