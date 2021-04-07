package practice;


 import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class deleteProject_BDD {
	
@Test
public void getAllProjects() {
		  
		 when()
		    .delete("http://localhost:8084/projects/"+"TY_PROJ_402")
		 .then()
		    .log().all()
		    .assertThat().statusCode(204);
	
	}

}
