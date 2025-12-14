package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetWithQueryParameter {

    @Test
    public void verifyGetWithQueryParameter() {
        RestAssured.baseURI = "https://reqres.in/api/";
        SoftAssert sf = new SoftAssert();
        Response response = RestAssured
                .given()
                .queryParam("page", 2)
                .header("x-api-key", "reqres_6cb359695752461fbfe4d0ee42d3608e")
                .header("content-type",ContentType.JSON)
                .log().all()
                .get("users")
                .then().log().all()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(response.jsonPath().getString("page"), "2");
        sf.assertEquals(response.jsonPath().getString("data[0].first_name"), "Michael");
        sf.assertEquals(response.jsonPath().getString("data[0].last_name"), "Lawson");
        sf.assertEquals(response.jsonPath().getString("data[1].first_name"), "Lindsay");
        sf.assertEquals(response.jsonPath().getString("data[1].last_name"), "Ferguson");
        sf.assertAll();
    }

}
