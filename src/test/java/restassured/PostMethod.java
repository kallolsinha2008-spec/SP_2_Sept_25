package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class PostMethod {

    //These are changes for Git
    @Test
    public void verifyPostMethod() {
        RestAssured.baseURI = "https://reqres.in/api/";
        JSONObject js = new JSONObject();
        js.put("name", "Bruce Wayne");
        js.put("company", "Wayne Enterprise");
        js.put("Position", "CEO");
        RestAssured
                .given()
                .header("x-api-key", "reqres_6cb359695752461fbfe4d0ee42d3608e")
                .header("content-type", ContentType.JSON)
                .body(js.toString())
                .log().all()
                .post("users")
                .then().log().all()
                .statusCode(HttpStatus.SC_CREATED)
                .assertThat()
                .body("name", Matchers.equalTo("Bruce Wayne"),
                        "company", Matchers.equalTo("Wayne Enterprise"),
                        "Position", Matchers.equalTo("CEO"),
                        "id", Matchers.notNullValue(),
                        "createdAt", Matchers.notNullValue());
    }
}
