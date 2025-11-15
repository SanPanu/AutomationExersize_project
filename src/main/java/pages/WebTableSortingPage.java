package pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebTableSortingPage 
{
	WebDriver driver;
	public WebTableSortingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By tableCard=By.xpath("//a[@href='/table']");
	private By priceItems=By.xpath("//table[@id='shopping']//tr//td[2]");
	private By totalPriceele=By.xpath("//tfoot/td[2]");
	
	private By sampletableHeaderElement=By.xpath("//table[@id='simpletable']/thead/tr/th");
	private By sampletablerowsElement=By.xpath("//table[@id='simpletable']/tbody/tr");
	private By caloriesHeader=By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']//th[@mat-sort-header='calories']");
	private By tableRows=By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']//tr");
	public void sortCalories()
	{
		driver.findElement(caloriesHeader).click();
		List<WebElement> rows = driver.findElements(tableRows);
		List<Integer>uiCalList=new ArrayList<>();
		for(WebElement row:rows)
		{
			String CaloriesText = row.findElement(By.xpath(".td[2]")).getText().trim();
			uiCalList.add(Integer.parseInt(CaloriesText));
		}

        System.out.println("UI Calories after sorting: " + uiCalList);
	
		
	}
	
	
	public void markPresentByLastName(String lastName)
	{
		Map<String,Integer>headerIndexMap=new HashMap<>();
		
		List<WebElement> headers = driver.findElements(sampletableHeaderElement);
		for(int i=0;i<headers.size();i++)
		{
			headerIndexMap.put(headers.get(i).getText().trim(), i+1);
		}
		Integer lastNameCol = headerIndexMap.get("Last name");
		Integer checkboxCol = headerIndexMap.get("Present/Absent");
		
		List<WebElement> rows = driver.findElements(sampletablerowsElement);
		for(WebElement row:rows)
		{
			String lName = row.findElement(By.xpath("./td["+lastNameCol+"]")).getText().trim();
			//String lName = row.findElement(By.xpath("//table[@id='simpletable']//tr//td[2]")).getText().trim();
			if(lName.equalsIgnoreCase(lastName))
			{
				WebElement checkbox=row.findElement(By.xpath("./td["+checkboxCol+"]//input[@type='checkbox']"));
				//WebElement checkbox=row.findElement(By.xpath("//table[@id='simpletable']//tr//td[4]"));
				if(!checkbox.isSelected())
				{
					checkbox.click();
					System.out.println("Marked present for: " + lastName);
				}else
				{
					System.out.println("Already marked present for: " + lastName);
				}
				
				
			}
		}
		
		
	}
	
	
	
	
	
	
	
	public void clickOnTableCard()
	{
		driver.findElement(tableCard).click();
	
	}
	public int addAllTheItemsPrice()
	{
		int TotalPrice = 0;
		List<WebElement> allPrice = driver.findElements(priceItems);
		for(int i=0;i<allPrice.size();i++)
		{
			String pricetext = allPrice.get(i).getText();
			int intPrice = Integer.parseInt(pricetext);
			System.out.println(pricetext+" ");
			TotalPrice=TotalPrice+intPrice;
			
			
		}
		
		return TotalPrice;
	}
	
	public int actPrice()
	{
		String totalPriceeletext = driver.findElement(totalPriceele).getText();
		int actPrice = Integer.parseInt(totalPriceeletext);
		
		return actPrice;
	}
	
	
	
	

}
