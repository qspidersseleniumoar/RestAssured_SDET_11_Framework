package com.rmgyantra.api.genericlib;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseClass {
	public DataBaseUtilities db = new DataBaseUtilities();
	@BeforeSuite
	public void configBS() {
		db.connectToDB();
		baseURI = "http://localhost";
		port = 8084;
	}
	
	
	@AfterSuite
	public void configAS() throws Throwable {
		db.closeDb();
	}


}
