package AbstractComponent;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReadData {

	String jsonfile;
	public JsonReadData(String jsonfile) {
		this.jsonfile = jsonfile;
	}
	
	public List<HashMap<String,String>> getjsondata() throws IOException {
		
		String jsonString = FileUtils.readFileToString(new File(jsonfile), StandardCharsets.UTF_8);
		
		ObjectMapper mapper = new ObjectMapper();
		// Type reference is used to marshal and unmarshall json string to hashmap list 	
		List<HashMap<String,String>> data  = mapper.readValue(jsonString, new TypeReference<List<HashMap<String,String>>>(){});
		 return data;
		
	}
	
}
