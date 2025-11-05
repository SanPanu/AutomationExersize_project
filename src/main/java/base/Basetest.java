package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest 
{
	protected WebDriver driver;
	protected Properties prop;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		prop=new Properties();
		String fileLoc = "/Users/sangamesh/eclipse-workspace/AutomationExersize_project/src/main/java/resources/config.properties";
		FileInputStream fis=new FileInputStream(fileLoc);
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("timeout"))));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();;
	}
}
