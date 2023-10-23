package PostBy_DifferentWays;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostBy_File {
	@Test
	public void File_post() {
		File file =new File("./PostbyFileREST.txt");
		
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		
		.post("/addProject")
		.then()
		.log().all();
		
		
	}
}
