package practice;


 import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class ProjectTestWith_BDD {
	
@Test
public void getAllProjects() {
		  
		 when()
		    .get("http://localhost:8084/projects")
		 .then()
		    .assertThat().statusCode(200)
		    .and()
		    .assertThat().contentType(ContentType.JSON)
		    .log().all();
	}

}
