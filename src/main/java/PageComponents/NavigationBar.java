package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponent.AbstractComponent;


public class NavigationBar extends AbstractComponent {
	WebDriver driver;
	By flightmain = By.cssSelector("[title='Flights']");
	By hotels = By.cssSelector("[title='Hotels']");
	By links = By.cssSelector("a");
	
	public NavigationBar(WebDriver driver, By sectionElement) {
		super(driver, sectionElement);
		// TODO Auto-generated constructor stub
	}

	public String selectfilgihts() {
		return findElement(flightmain).getAttribute("class");
		
	}
	
	public String selecthotel() {
		return findElement(hotels).getAttribute("href");
		
	}
	
	public int getlinkcountnavigate() {
		return findElements(links).size();
	}
}
