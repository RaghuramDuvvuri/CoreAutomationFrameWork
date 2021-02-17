package PageComponents;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponent.AbstractComponent;
import AbstractComponent.SearchFlightAvailability;

public class RoundTrip extends AbstractComponent implements SearchFlightAvailability {
	WebDriver driver;
	public RoundTrip(WebDriver driver, By sectionElement) {
		super(driver, sectionElement);
		// TODO Auto-generated constructor stub
	}

	public void checkAail(String origin, String dest) {
		// TODO Auto-generated method stub
		System.out.println("This is in round trip orign is "+origin+" the destination is "+dest);
	}

	public void checkAail(HashMap<String, String> origdest) {
		// TODO Auto-generated method stub
		
	}

}
