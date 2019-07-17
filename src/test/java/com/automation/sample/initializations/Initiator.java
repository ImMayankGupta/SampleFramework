package com.automation.sample.initializations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.automation.sample.pageObjects.FlightSearchPage;
import com.automation.sample.pageObjects.FlightSearchResultPage;
import com.automation.sample.pageObjects.HomePage;
import com.automation.sample.pageObjects.HotelSearchPage;
import com.automation.sample.pageObjects.HotelSearchResultPage;
import com.automation.sample.pageObjects.SignInModal;

public class Initiator {

	private WebDriver driver;
	public HomePage homepage;
	public FlightSearchPage flightSearchPage;
	public FlightSearchResultPage flighSearchResultPage;
	public HotelSearchPage hotelSearchPage;
	public HotelSearchResultPage hotelSearchResultPage;
	public SignInModal signInModal;

	private DriverCreator drFactory;
	
	
	public Initiator(String browser){
		drFactory = new DriverCreator();
		_startBrowser(browser);
		_initPageObject();
	}
	
	private void _startBrowser(String browser){
		driver = drFactory.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	private void _initPageObject(){
		homepage = new HomePage(driver);
	}
	
}
