package generics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parser {
	
	
	

	public JSONObject convertToJsonObject(String filename) throws FileNotFoundException, IOException, ParseException{
		Object obj=new JSONParser().parse(new FileReader(System.getProperty());
		
		JSONObject jobj= (JSONObject) obj;
		return jobj;
				
	}

}

