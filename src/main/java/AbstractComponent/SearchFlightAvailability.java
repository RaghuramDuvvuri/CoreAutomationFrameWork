package AbstractComponent;

import java.util.HashMap;

public interface SearchFlightAvailability {
	
	//public void checkAail(String origin, String dest);
	public void checkAail(HashMap<String, String> origdest);	
	
	public void dispmessage();
}
