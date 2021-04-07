package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;


public class CreateProject2_BDD2_HASHMAP {

	@Test
	public void createProject() {
		HashMap map= new HashMap();
		map.put("createdBy", "deepak");
		map.put("projectName", "zoho-2");
		map.put("status", "Created");
		map.put("teamSize", 10);
		
		given()
		   .contentType(ContentType.JSON)
		   .body(map)
		.when()
		   .post("http://localhost:8084/addProject")
		.then()
		   .log().all()
		   .assertThat().statusCode(201)
		   .assertThat().contentType(ContentType.JSON);
 
	}

}
