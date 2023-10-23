package RequestChaining;



import org.testng.annotations.Test;

import POJOLibrary.Project_Library;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Post_del {
	
@Test
public void PostAndDel() {

	baseURI="http://localhost";
	port=8084;
	Random ran=new Random();
	int key = ran.nextInt(100);

	Project_Library plib= new Project_Library();
	plib.Project_Library("KKM", "Artist"+key, "Active", 1);
	
	Response req = given()
	.body(plib).contentType(ContentType.JSON)
	.when()
	.post("/addProject");
	
	String ProjectId = req.jsonPath().get("projectId");
	System.out.println(ProjectId);
	
	
	when().delete("/projects"+ProjectId)
	.then().log().all();
}
}