package E09_FetchElementFromAPIResponseBody;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Ex_with_RestAssured {
	public static void main(String[] args) {
        // Send GET request
        Response response = RestAssured.get("https://api.example.com/data");

        // Print full response body
        System.out.println(response.getBody().asString());

        // Fetch specific element (e.g., "id")
        String id = response.jsonPath().getString("id");
        System.out.println("Fetched ID: " + id);

        // Fetch nested element (e.g., "user.name")
        String userName = response.jsonPath().getString("user.name");
        System.out.println("User Name: " + userName);
    }
}
