package BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Put {
	@Test
	public void put() {
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "SRK");
		obj.put("projectName", "Jawaan &Pathan");
		obj.put("status", "Blockbuster & hit");
		obj.put("teamSize", 2);
		
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.put("projects/TY_PROJ_210")
		.then()
		.log().all();
}
}