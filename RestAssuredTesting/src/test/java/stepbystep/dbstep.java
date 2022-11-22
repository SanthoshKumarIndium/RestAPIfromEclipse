package stepbystep;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class dbstep {
	
	@Test(enabled=false)
	public void dbget() {
		baseURI="http://localhost:3000";
		
		given()
		.when()
		.get("/database?name=Albert")
		.then()
		.statusCode(200)
		.log().all();			
	}
	
	@Test(enabled=false)
	public void dbpost() {
		baseURI="http://localhost:3000";
		
		JSONObject data = new JSONObject();
		data.put("name", "SundarPichai");
		data.put("job", "CEO-Google");
		data.put("marketvalue", 95);
		
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(data.toJSONString())
		.when()
		.post("/database")
		.then()
		.statusCode(201)
		.log().all();			
	}
	
	@Test(enabled=false)
	public void dbput() {
		baseURI="http://localhost:3000";
		
		JSONObject data = new JSONObject();
		data.put("name", "Kamal");
		data.put("job", "Actor");
		data.put("marketvalue", 85);
		
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(data.toJSONString())
		.when()
		.put("/database/4")
		.then()
		.statusCode(200)
		.log().all();			
	}
	
	@Test()
	public void dbpatch() {
		baseURI="http://localhost:3000";
		
		JSONObject data = new JSONObject();
		
		data.put("marketvalue", 89);
		
		given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(data.toJSONString())
		.when()
		.patch("/database/4")
		.then()
		.statusCode(200)
		.log().all();			
	}


}
