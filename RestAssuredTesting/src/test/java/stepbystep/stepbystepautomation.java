package stepbystep;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class stepbystepautomation {
	
	@Test(enabled=false)
	public void testget() {
		baseURI="https://reqres.in/api/users";
		
		given()
		.when()
		.get("?page=2")
		.then()
		.body("data[1].id",equalTo(8))
		.body("data.id", hasItems(8,9,10,11,12));
			
	}
	
	@Test(enabled=false)
	public void testpost() {
		JSONObject data=new JSONObject();
		data.put("name", "john");
		data.put("job", "zohoi");
		
		System.out.println(data);
		System.out.println(data.toJSONString());
		String jsondata=data.toJSONString();
		baseURI="https://reqres.in/api/users";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsondata)
			.when()
			.post()
			.then()
			.log()
			.all();
			
	}
	
	@Test(enabled=false)
	public void testput() {
		JSONObject data=new JSONObject();
		data.put("name", "john");
		data.put("job", "zohoi");
		
		System.out.println(data);
		System.out.println(data.toJSONString());
		String jsondata=data.toJSONString();
		baseURI="https://reqres.in/api/users";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsondata)
			.when()
			.put("/2")
			.then()
			.log()
			.all();
			
	}
	
	@Test(enabled=false)
	public void testpatch() {
		JSONObject data=new JSONObject();
		data.put("name", "john");
		data.put("job", "zohoi");
		
		System.out.println(data);
		System.out.println(data.toJSONString());
		String jsondata=data.toJSONString();
		baseURI="https://reqres.in/api/users";
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(jsondata)
			.when()
			.patch("/2")
			.then()
			.log()
			.all();
			
	}
	
	@Test(enabled=false)
	public void testdelete() {
		
		baseURI="https://reqres.in/api/users";
		
			when()
			.delete("/2")
			.then()
			.log()
			.all();
			
	}


}
