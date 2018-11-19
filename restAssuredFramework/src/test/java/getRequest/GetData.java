package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetData {

	@Test
	public void testResponse() {
		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q-London,uk&appid=b1b15e88fa797225412c1c50c122a1429");
		int statusCode = resp.getStatusCode();
		System.out.println(statusCode);
		//String data = resp.asString();
		//System.out.println(data);
		Assert.assertEquals(statusCode, 200);
	}
	
}
