package internal;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by william.russell on 8/28/17. This is just a throwaway framework.
 */
public class BaseDriver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (null == driver) {
			driver = createDriver();
		}
		return driver;
	}

	private static WebDriver createDriver() {

		DesiredCapabilities capabilities = org.openqa.selenium.remote.DesiredCapabilities.chrome();
		HashMap<String, String> chromePreferences = new HashMap<>();
		chromePreferences.put("profile.password_manager_enabled", "false");

		capabilities.setCapability("chrome.prefs", chromePreferences);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-extensions");

		capabilities.setCapability(org.openqa.selenium.chrome.ChromeOptions.CAPABILITY, chromeOptions);
		LoggingPreferences loggingprefs = new LoggingPreferences();
		loggingprefs.enable(org.openqa.selenium.logging.LogType.BROWSER, java.util.logging.Level.INFO);

		capabilities.setCapability(org.openqa.selenium.remote.CapabilityType.LOGGING_PREFS, loggingprefs);

		ClassLoader classLoader = BaseDriver.class.getClassLoader();

		if (OS.isFamilyMac()) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		} else {
			// untested
			File file = new File(classLoader.getResource("chromedriver.exe").getFile());
			System.setProperty("webdriver.chrome.driver", file.getPath());
		}
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		return driver;
	}

}
