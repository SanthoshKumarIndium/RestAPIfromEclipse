package RA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUDnonBDD {

	@Test(enabled=false)
	public void getMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";

		RequestSpecification requestSpecification= RestAssured.given();

		Response response= requestSpecification.request(Method.GET,"?page=2");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}

	@Test(enabled=false)
	public void postMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";

		RequestSpecification requestSpecification= RestAssured.given()
				.header("Content-Type", "application/json")
				.body("{\"name\": \"morpheus\",\"job\": \"leader\"}");

		Response response= requestSpecification.request(Method.POST);

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());

	}
	
	@Test(enabled=false)
	public void putMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification requestSpecification= RestAssured
		.given()
		.header("Content-Type","application/json")
		.body("{\"name\": \"morpheus\",\"job\": \"furher\"}");
		
		Response response= requestSpecification.request(Method.PUT,"/2");
		
		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}
	
	@Test
	public void deleteMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RequestSpecification requestSpecification= RestAssured.given();
		
		Response response=requestSpecification.request(Method.DELETE,"/2");
		
		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
		
	}

}
