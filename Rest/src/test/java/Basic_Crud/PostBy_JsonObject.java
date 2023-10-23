package Basic_Crud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PostBy_JsonObject {
	@Test
public void post() {
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "SID KHAN");
	obj.put("projectName", "Millionare");
	obj.put("status", "KeepOn");
	obj.put("teamSize", 1);
	
	RequestSpecification req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	Response res = req.post("http://localhost:8084/addProject");
	System.out.println(res.asPrettyString());

}
}
