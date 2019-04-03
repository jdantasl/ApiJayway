import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

	@Test	
	public void consultarApi() {
		
		 given()
		 .contentType("application/json")
		 .when()
		    .get("https://jsonplaceholder.typicode.com/todos/1")
		 .then()
		    .statusCode(200)
		    .body("userId", is(1))
		    .body("id", is(1))
		    .body("title", equalTo("delectus aut autem"))
		    .body("completed", equalTo(false));
	}

}
