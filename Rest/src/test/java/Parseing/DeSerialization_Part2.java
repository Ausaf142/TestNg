package Parseing;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJOLibrary.Project_Library;

public class DeSerialization_Part2 {
@Test
public void DeSerial() throws IOException, JsonMappingException, IOException {
	ObjectMapper obj =new ObjectMapper();
	Project_Library data = obj.readValue(new File("./Serialization.json"), Project_Library.class);
	System.out.println(data.getCreatedBy());
	System.out.println(data.getProjectName());
	System.out.println(data.getStatus());
	System.out.println(data.getTeamSize());
	
}
}
