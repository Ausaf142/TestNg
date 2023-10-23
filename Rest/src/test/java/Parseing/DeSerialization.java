package Parseing;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJOLibrary.Project_Library;

public class DeSerialization {
@Test
public void deserial() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper obj = new ObjectMapper();
	Project_Library emp = obj.readValue(new File("./ser.json"), Project_Library.class);
	System.out.println(emp.getCreatedBy());
	emp.setCreatedBy("bhoot");
	System.out.println(emp.getCreatedBy());
}
}
