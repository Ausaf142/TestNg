package BDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//This static import is necessary for BDD

public class Get {
@Test
public void get() {
	baseURI="http://localhost";
	port=8084;
	
	when()
	.get("projects")
	.then()
	.log().all();
}
}
