package E09_FetchElementFromAPIResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Ex_with_Jackson {
	public static void main(String[] args) throws Exception {
        String jsonResponse = "{ \"id\": 123, \"user\": { \"name\": \"Alice\" } }";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonResponse);

        int id = root.get("id").asInt();
        String userName = root.get("user").get("name").asText();

        System.out.println("ID: " + id);
        System.out.println("User Name: " + userName);
    }
}
