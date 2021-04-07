package practice;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.rmg.pojoclass.Project;

import io.restassured.http.ContentType;


public class CreateProject2_BDD2_POJOClass {

	@Test
	public void createProject() {
	    
        Project pobj = new Project("deepak","MicroSoft-1","Completed",10);
		given()
		   .contentType(ContentType.JSON)
		   .body(pobj)
		.when()
		   .post("http://localhost:8084/addProject")
		.then()
		   .log().all();
		
 
	}

}



