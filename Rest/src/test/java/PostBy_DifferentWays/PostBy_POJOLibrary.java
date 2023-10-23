package PostBy_DifferentWays;

import org.testng.annotations.Test;

import Generic.JavaLibrary;
import POJOLibrary.Project_Library;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostBy_POJOLibrary {
@Test
public void postBy_library() { 
	baseURI="http://localhost";
	port=8084;
	JavaLibrary jlib = new JavaLibrary();
	Project_Library plib = new Project_Library();
	int key = jlib.getRandom();
	  plib.Project_Library("AMAR", "FLEEK_IT"+key, "ACTIVE", 5);
  


	given()
	.body(plib)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then().log().all();
}
}
