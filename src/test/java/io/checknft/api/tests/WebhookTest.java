package io.checknft.api.tests;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class WebhookTest extends BaseTest {

    @Test(description = "Sets the webhook. Webhooks notify your application about events that occur in our app " +
            "asynchronously through HTTP POST request.")
    public void setWebHookNotification() {
        JSONObject body = new JSONObject();
        body.put("endpoint", "endpoint");
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .header("Content-Type", "application/json")
                .body(body.toString())
                .when()
                .post("/api/public/v1/token/account/amount")
                .then()
                .assertThat()
                .statusCode(201);
    }
}