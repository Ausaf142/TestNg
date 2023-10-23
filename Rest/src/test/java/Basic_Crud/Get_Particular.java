package Basic_Crud;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Particular {
@Test
public void getSingle() {
	Response req = RestAssured.get("http://localhost:8084/projects/TY_PROJ_207");
	System.out.println(req.asPrettyString());
}
}
