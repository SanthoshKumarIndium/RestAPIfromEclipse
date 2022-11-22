package RA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CRUD_BDD {
	
	@Test(enabled=false)
	public void getMethod() {
		RestAssured
		.given()
			.baseUri("https://reqres.in/api/users")
		.when()
			.get("?page=2")
		.prettyPrint();
	}
	
	@Test(enabled=false)
	public void postMethod() {
		RestAssured
		.given()
		.baseUri("https://reqres.in/api/users")
		.header("Content-Type","application/json")
		.body("{\"name\": \"morpheus\",\"job\": \"leader\"}")
		.when()
		.post()
		.prettyPrint();
	}
	
	@Test(enabled=false)
	public void putMethod() {
		RestAssured
		.given()
		.baseUri("https://reqres.in/api/users")
		.header("Content-Type","application/json")
		.body("{\"name\": \"morpheus\",\"job\": \"leader\"}")
		.when()
		.put("/2")
		.prettyPrint();
	}
	
	@Test
	public void deleteMethod() {
		RestAssured
		.given()
		.baseUri("https://reqres.in/api/users")
		.when()
		.delete("/2")		
		.prettyPrint();
	}

}
