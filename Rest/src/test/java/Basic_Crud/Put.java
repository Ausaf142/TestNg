package Basic_Crud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
@Test
public void put_mtd() {
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "Naaz");
	obj.put("projectName", "Millionare");
	obj.put("status", "Mom");
	obj.put("teamSize", 1);
	
	RequestSpecification req = RestAssured.given();
	req.body(obj);
	req.contentType(ContentType.JSON);
	Response res = req.put("http://localhost:8084/projects/TY_PROJ_207");
	System.out.println(res.asPrettyString());
}

}
