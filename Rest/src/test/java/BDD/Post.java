package BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Post {
@Test
public void post() {
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SRK");
	obj.put("projectName", "Jawaan");
	obj.put("status", "Blockbuster");
	obj.put("teamSize", 1);
	
	
	
	baseURI="http://localhost";
	port=8084;
	
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	
	.post("/addProject")
	.then()
	.log().all();
	
	
}
}
