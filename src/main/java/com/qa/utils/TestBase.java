package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	String propPath = System.getProperty("user.dir") + File.separator + "support" + File.separator + "config"
			+ File.separator + "config.properties";

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(propPath);
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Initialization() {

		String browserName = prop.getProperty("browser");
		String browserPath = System.getProperty("user.dir") + File.separator + "support" + File.separator + "driver"
				+ File.separator;

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", browserPath + "chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", browserPath + "geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));

	}

	public static void DeInitialization() {

		driver.close();

		driver.quit();
	}

}
