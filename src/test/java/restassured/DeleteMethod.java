package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class DeleteMethod {

    @Test
    public void verifyPutMethod() {
        RestAssured.baseURI = "https://reqres.in/api/";

        RestAssured
                .given()
                .header("x-api-key", "reqres_6cb359695752461fbfe4d0ee42d3608e")
                .header("content-type", ContentType.JSON)
                .log().all()
                .delete("users/2")
                .then().log().all()
                .statusCode(HttpStatus.SC_NO_CONTENT)
                .assertThat();

    }
}
