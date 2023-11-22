package gp.service;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiTest {

	@Test
	public void ApiTest() {

		RestAssured.baseURI = "https://app.thegpservice.co.uk/register/login";

		String email = "subashanajanith9@gmail.com";
		String password = "Gpservice@123";
		
		RestAssured.given().when().get(RestAssured.baseURI).then()
		.statusCode(200);
	
	}

}
