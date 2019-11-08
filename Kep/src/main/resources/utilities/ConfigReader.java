import java.util.Properties;

public class ConfigReader 
{
	Properties properties = new Properties();
	public void loadConfig() 
	{
		
		properties.load(getClass().getResourceAsStream("Config.properties"));
	}
	
	public void reader()
	{
		Settings.browser = BrowserType.valueOf(properties.getProperty("browser"));
		Settings.url = properties.getProperty("url");
	}
	
}
