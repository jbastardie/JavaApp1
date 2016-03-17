/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convertisseur;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Jeremy
 */
public class JsonParse {
    private static final String filePath = "C:\\Users\\Jeremy\\Desktop\\Cours 4A EPF\\AppJava\\Convertisseur\\dataDevise.json";
	
	public JSONObject getData() {
            JSONObject jsonObject = null;
		try {
			// read the json file
			FileReader reader = new FileReader(filePath);

			JSONParser jsonParser = new JSONParser();
			jsonObject = (JSONObject) jsonParser.parse(reader);

			// get a String from the JSON object
                        return jsonObject;


		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
                return jsonObject;
	}
        
}
