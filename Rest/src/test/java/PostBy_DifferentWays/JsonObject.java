package PostBy_DifferentWays;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
@Test
public class JsonObject {
	
	public void Jobject_post() {
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "JSONObjet");
	obj.put("projectName", "Rest");
	obj.put("status", "Active");
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
