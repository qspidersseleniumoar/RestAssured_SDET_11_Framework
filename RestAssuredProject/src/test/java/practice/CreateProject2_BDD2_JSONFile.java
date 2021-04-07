package practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;


public class CreateProject2_BDD2_JSONFile {

	@Test
	public void createProject() {
	    
		File fileNAme = new File("./Project.json");
		given()
		   .contentType(ContentType.JSON)
		   .body(fileNAme)
		.when()
		   .post("http://localhost:8084/addProject")
		.then()
		   .log().all();
		
 
	}

}
