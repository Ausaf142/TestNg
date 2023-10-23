package BasicCRUD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_All {
@Test
public void get_mtd() {
	Response req = RestAssured.get("http://localhost:8084/projects");
	System.out.println(req.asPrettyString());
	
}
	
}
