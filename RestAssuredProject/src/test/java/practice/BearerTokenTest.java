package practice;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BearerTokenTest {
	@Test
	public void loginCheck() {
            HashMap map = new HashMap();
            		map.put("name", "SDET-17");
		
	    	given()
	    	   .auth().oauth2("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")
	    	   .contentType(ContentType.JSON)
	    	   .body(map)
	    	.when()
	    	    .post("https://api.github.com/user/repos")
	    	.then()
	    	   //.assertThat().statusCode(202)
	    	   .log().all();
 
	}

}
