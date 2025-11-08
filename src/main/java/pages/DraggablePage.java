	package pages;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	
	public class DraggablePage 
	{
		WebDriver driver;
		public DraggablePage(WebDriver driver)
		{
			this.driver=driver;
		}
		private By dragableBox =By.id("sample-box");
		private By dragCard=By.xpath("//a[normalize-space()='AUI - 1']");
		
		public void clickDragCard()
		{
			driver.findElement(dragCard).click();
		}
		
		public void dragElement(int xOffset,int yOffset)
		{
			Actions act=new Actions(driver);
			WebElement DragableElent = driver.findElement(dragableBox);
			act.clickAndHold(DragableElent).moveByOffset(xOffset, yOffset).release().perform();
			
		}
		public WebElement getDragbaleElement()
		{
			return driver.findElement(dragableBox);
		}
		
	
	}
