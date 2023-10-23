package RequestChaining;

import org.testng.annotations.Test;

import POJOLibrary.Project_Library;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PostAndGet {
@Test
public void post_Get() {
	baseURI="http://localhost";
	port=8084;
	
	Random ran=new Random();
	int key = ran.nextInt(100);

	Project_Library plib= new Project_Library();
	plib.Project_Library("KKM", "Artist6"+key, "Active", 1);
	baseURI="http://localhost";
	port=8084;
	
	Response req = given()
	.body(plib).contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	String ProjectId = req.jsonPath().get("projectId");
	System.out.println(ProjectId);
	req.then().log().all();
	
	when().get("/projects/"+ProjectId)
	.then().log().all();
	
}
}