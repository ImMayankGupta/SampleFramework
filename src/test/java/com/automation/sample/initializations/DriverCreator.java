package com.automation.sample.initializations;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverCreator {

	private static String browser;
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public WebDriver getDriver(String browserName) {
        browser = browserName;
        
        if (browser.equals("chrome")){
             	return getChromeDriver(System.getProperty("user.dir") + File.separator+ "Resources"+ File.separator+ "chromedriver_linux");           	
            }
             
             System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator+ "Resources"+ File.separator+ "chromedriver");
             return new ChromeDriver();
    }

    @SuppressWarnings("deprecation")
	private static WebDriver getChromeDriver(String driverpath) {
        System.setProperty("webdriver.chrome.driver", driverpath);
        capabilities.setJavascriptEnabled(true);
        return new ChromeDriver(capabilities);
    }


 
	
}