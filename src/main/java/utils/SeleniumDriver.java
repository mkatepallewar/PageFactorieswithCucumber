package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	//Intiatlize webdriver
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT=15;
	
	private SeleniumDriver() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		prefs.put("credentials_enable_service", true);
		prefs.put("profile.password_manage_enabled", true);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-infobars");
		String user_agent = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.50 Safari/537.36";
		options.addArguments("user-agent={"+ user_agent + "}");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver=new WebDriverWait(driver, TIMEOUT);
		
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if (seleniumDriver==null) {
			seleniumDriver=new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		if (driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}

}
