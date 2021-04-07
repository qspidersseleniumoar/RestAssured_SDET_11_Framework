package comrmg.yantra.projects;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmg.pojoclass.Project;
import com.rmgyantra.api.genericlib.BaseClass;
import com.rmgyantra.api.genericlib.DataBaseUtilities;
import com.rmgyantra.api.genericlib.IEndPoints;
import com.rmgyantra.api.genericlib.JavaUtility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class AddSingleProjectWithOnGoing extends BaseClass{
	
	
	@Test
	public void createProject() throws Throwable {
		String actStatus = "On Going";
		String actProjectNAme = "Sdet-"+JavaUtility.getRanDomNum();
		  Project pobj = new Project("deepak", actProjectNAme,actStatus, 10);
		  
		  Response resp = given()
					     .contentType(ContentType.JSON)
					     .body(pobj)
					  .when()
					  .post(IEndPoints.createProject);
		  
		  String actAPIResp_ProjectNAme = resp.jsonPath().get("projectName");
		  String actAPIResp_status = resp.jsonPath().get("status");			 
		  

		  
		  String actDBData = db.executeQueryAndGetData("select * from project" , 4 , actProjectNAme);
		  String actstatus = db.executeQueryAndGetData("select * from project" , 5 , actAPIResp_status);

		  
		  
	}

}










