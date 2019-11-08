import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends StarWebdriver
{
	@BeforeSuite
	public void init() 
	{
		ConfigReader read = new ConfigReader();
		read.reader();
		openBrowser(Settings.browser, Settings.url);
		
	}
	
	@AfterSuite
	public void tearDown() 
	{
		if(driver != null) 
		{
			driver.closed();
			driver.quit();
		}
	}
}
