package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class UdateProject_BDD {

		@Test
		public void updateProject() {
			JSONObject jObject= new JSONObject();
			jObject.put("projectName", "zoho-222");
	
			
			given()
			   .contentType(ContentType.JSON)
			   .body(jObject)
			.when()
			   .patch("http://localhost:8084/projects/"+"TY_PROJ_402")
			.then()
			   .log().all()
			   .assertThat().statusCode(201)
			   .assertThat().contentType(ContentType.JSON);
	 
		}

}
