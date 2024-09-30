package common.fanode.request;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CommonRequestSpec {
	private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

	public static RequestSpecification getRequestSpec() {
		return RestAssured.given().baseUri(BASE_URL).header("Content-Type", "application/json").header("Accept",
				"application/json");
	}
}
