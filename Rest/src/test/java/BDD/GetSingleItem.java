package BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetSingleItem {
	@Test
	public void getSingle() {
		baseURI="http://localhost";
		port=8084;
		
	
		
		when()
		.get("projects/TY_PROJ_208")
		.then()
		.log().all();
	}
}
