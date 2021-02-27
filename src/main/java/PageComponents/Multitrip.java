package PageComponents;

import java.util.HashMap;

import AbstractComponent.SearchFlightAvailability;

public class Multitrip implements SearchFlightAvailability {

	public void checkAail(String origin, String dest) {
		// TODO Auto-generated method stub
		System.out.println("This the round trip");
	}

	public void checkAail(HashMap<String, String> origdest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispmessage() {
		System.out.println("This is multitrip class message for to check git intergration with jenkins");
		
	}

}
