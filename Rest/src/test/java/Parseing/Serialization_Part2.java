package Parseing;

import java.io.File;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Part2 {
@Test
public void Ser1() throws JsonGenerationException, JsonMappingException, IOException {
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "JSONObjet");
	jobj.put("projectName", "Rest");
	jobj.put("status", "Active");
	jobj.put("teamSize", 1);
	
	
	ObjectMapper omap=new ObjectMapper();
	omap.writeValue(new File("./Serialization.json"), jobj);
	}
}
