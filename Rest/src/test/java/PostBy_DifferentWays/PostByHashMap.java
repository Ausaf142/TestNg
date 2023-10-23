package PostBy_DifferentWays;


	import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.simple.JSONObject;
	import org.testng.annotations.Test;

	import io.restassured.http.ContentType;
	@Test
	public class PostByHashMap {
		
		public void HashMapObj_post() {
		 HashMap hobj=new HashMap();
		hobj.put("createdBy", "HASHMAPObjet");
		hobj.put("projectName", "Restassured");
		hobj.put("status", "Active");
		hobj.put("teamSize", 1);
		
		
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(hobj)
		.contentType(ContentType.JSON)
		.when()
		
		.post("/addProject")
		.then()
		.log().all();
		
		
	}
}
