package PageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponent.FactoryDesign;
import AbstractComponent.SearchFlightAvailability;
import PageComponents.FooterNavigations;
import PageComponents.NavigationBar;
import PageComponents.Oneway;
import PageComponents.RoundTrip;

public class TravelHomePage {
	By sectionElement = By.id("traveller-home");
	By sectionElementNavigate = By.id("buttons");
	//By sectionflightsearch = By.id("flightSearchContainer");
	WebDriver driver;
	SearchFlightAvailability sfa;
	String Jsonfile;
	public TravelHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public NavigationBar getNavigationBar() {
		return new NavigationBar(driver,sectionElementNavigate);
	}

	public void goTo(String url) {
		driver.get(url);
	}
	
	public FooterNavigations getFooterNavigations() {
		return new FooterNavigations(driver, sectionElement);
	}
	

	
	public void setBooking(String Typeclass) {
		FactoryDesign fd = new FactoryDesign(driver);
	    this.sfa = fd.createClassTypes(Typeclass);
		
	}
	
	public void checkavai(HashMap<String,String> origdest) {
		sfa.checkAail(origdest);
	}
	
	public void displayintegrationgitmessage() {
		sfa.dispmessage();
		
	}
}


