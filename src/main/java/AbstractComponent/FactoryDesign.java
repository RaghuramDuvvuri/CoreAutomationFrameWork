package AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageComponents.Oneway;
import PageComponents.RoundTrip;

public class FactoryDesign {
	WebDriver driver;
	By sectionflightsearch = By.id("flightSearchContainer");
	
	public FactoryDesign(WebDriver driver) {
		this.driver = driver;
	}


	public SearchFlightAvailability createClassTypes(String typeClass) {
		SearchFlightAvailability srchclass = null;
		if (typeClass.equalsIgnoreCase("Oneway")) {
			srchclass =  new Oneway(driver,sectionflightsearch );
		}
		
		if (typeClass.equalsIgnoreCase("RoundTrip")) {
			srchclass = new RoundTrip(driver,sectionflightsearch );
		}
		return srchclass;
		
	}

}
