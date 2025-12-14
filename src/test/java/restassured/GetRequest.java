package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class GetRequest {

    @Test
    public void verifyGetRequest() {
        RestAssured.baseURI = "https://reqres.in/api/";
        RestAssured
                .given()
                .header("x-api-key", "reqres_6cb359695752461fbfe4d0ee42d3608e")
                .header("content-type", ContentType.JSON)
                .log().all()
                .get("users/2")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data.id", Matchers.equalTo(2),
                        "data.first_name", Matchers.equalTo("Janet"),
                        "data.last_name", Matchers.equalTo("Weaver"));


    }
}
