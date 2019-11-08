import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StarWebdriver 
{
	public static WebDriver driver;
	
	public static void openBrowser(BrowserType type, String url) 
	{
		switch (type) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "/Users/skycatch/eclipse-workspace/Kep/src/main/resources/executables/chromedriver 2");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "/Users/skycatch/eclipse-workspace/Kep/src/main/resources/executables/chromedriver 2");
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException();
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	
}
