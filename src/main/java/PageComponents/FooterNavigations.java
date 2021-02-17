package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponent.AbstractComponent;

public class FooterNavigations extends AbstractComponent {
	WebDriver driver;
	By flights = By.cssSelector("[title='Flights']");
	By links = By.cssSelector("a");
	
	
	public FooterNavigations(WebDriver driver ,By sectionElement) {
		super(driver,sectionElement);
	}

	public String selectfilgihts() {
		return findElement(flights).getAttribute("class");
		
	}

	public int getLinks() {
		
		return findElements(links).size();
	}

}

