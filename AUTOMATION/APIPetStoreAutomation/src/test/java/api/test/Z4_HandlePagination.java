package api.test;

import static io.restassured.RestAssured.given;

import java.util.List;

import io.restassured.response.Response;

public class Z4_HandlePagination {
	public static void main(String[] args) {
		int page = 1;
		Response response;
		
		do {
			response = given().param("page", page).when().get("https://reqres.in/api");
			List<String> users = response.jsonPath().getList("data.id");
			System.out.println("Page "+page+" : "+users);
			page++;
		} while(response.jsonPath().getBoolean("has_more"));
	}
}
