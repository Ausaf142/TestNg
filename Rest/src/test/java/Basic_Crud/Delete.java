package Basic_Crud;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete {
@Test
public void  Del() {
	Response req = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_203");
	int expcode=204;
	int actcode=req.getStatusCode();
	Assert.assertEquals(expcode, actcode);
	System.out.println(req.asPrettyString());
}
}
