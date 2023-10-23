package BDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class Delete {
	@Test

	public void del() {
		baseURI="http://localhost";
		port=8084;
		
	
		
		when()
		.delete("projects/TY_PROJ_209")
		.then()
		.log().all();
}
}