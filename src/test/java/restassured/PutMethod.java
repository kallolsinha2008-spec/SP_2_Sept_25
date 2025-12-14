package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class PutMethod {

    @Test
    public void verifyPutMethod() {
        RestAssured.baseURI = "https://reqres.in/api/";
        JSONObject js = new JSONObject();
        js.put("name", "Bruce Wayne");
        js.put("company", "Infosys");
        js.put("Position", "CEO");
        RestAssured
                .given()
                .header("x-api-key", "reqres_6cb359695752461fbfe4d0ee42d3608e")
                .header("content-type", ContentType.JSON)
                .body(js.toString())
                .log().all()
                .put("users/2")
                .then().log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("name", Matchers.equalTo("Bruce Wayne"),
                        "company", Matchers.equalTo("Infosys"),
                        "Position", Matchers.equalTo("CEO"),
                        "updatedAt", Matchers.notNullValue());
    }
}
