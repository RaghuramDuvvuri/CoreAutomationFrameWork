package PageComponents;




import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponent.AbstractComponent;
import AbstractComponent.SearchFlightAvailability;


public class Oneway extends AbstractComponent implements SearchFlightAvailability{

	WebDriver driver;
	By Tripoption = By.xpath("//table[@class='tblTrip']//input[@value='OneWay']");
	By citydropdown=By.xpath("//div[@id='dropdownGroup1']");
	By cities = By.xpath("//div[@id='dropdownGroup1']//li/a");
	
	By origincity = By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']");
	By destcity = By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//li/a");
	
	
	public Oneway(WebDriver driver, By sectionElement) {
		super(driver, sectionElement);
		// TODO Auto-generated constructor stub
	}

	public void checkAail(HashMap<String,String> origdest) {

		String chkselected = findElement(Tripoption).getAttribute("checked");
		System.out.println("the value of selected item is "+chkselected);
		findElement(origincity).click();
		// select origin city
		List<WebElement> lscities = findElements(cities);
		selectCities(lscities,origdest.get("origin"));
		// select destination city
		elementWait(destcity);
		List<WebElement> lsdestcities = findElements(destcity);
		selectCities(lsdestcities,origdest.get("destination"));
	
	}

	private void selectCities(List<WebElement> lscities, String Cityname) {
		for (int i =0;i <= lscities.size() -1 ;i++) {
			String citycheck = lscities.get(i).getText();
			if (Cityname.equals(citycheck)) {
				lscities.get(i).click();
				System.out.println("The values are :"+lscities.get(i).getText());
			}	
		} // for
		
	} // void 
		
		
	public void dispmessage() {
		System.out.println("hook established");
	}


}
