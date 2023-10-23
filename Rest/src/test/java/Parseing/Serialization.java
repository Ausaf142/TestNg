package Parseing;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJOLibrary.Project_Library;

public class Serialization {
@Test
public void serial() throws JsonGenerationException, JsonMappingException, IOException {
	Project_Library plib = new Project_Library();
	plib.Project_Library("me", "my", "Active", 50);
	ObjectMapper obj= new ObjectMapper();
	obj.writeValue(new File("./ser.json"),plib);
}
}
