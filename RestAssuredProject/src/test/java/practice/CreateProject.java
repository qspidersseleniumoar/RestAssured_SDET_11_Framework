package practice;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {

	@Test
	public void createProject() {
		JSONObject jObject= new JSONObject();
		jObject.put("createdBy", "deepak");
		jObject.put("projectName", "zoho");
		jObject.put("status", "Created");
		jObject.put("teamSize", 10);
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jObject);
		Response resp = req.post("http://localhost:8084/addProject");

		  String  completeBody = resp.prettyPrint();
		  System.out.println(completeBody);
		  
		  int actSC = resp.getStatusCode();
		  Assert.assertEquals(201, actSC);
		  
		  String actCT = resp.getContentType();
		  Assert.assertEquals("application/json", actCT);
		  
	}

}
