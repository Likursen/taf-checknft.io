package io.checknft.api.tests;

import io.checknft.api.pojo.events.EventListByAccountAddressPojo;
import io.checknft.api.pojo.events.EventsListByContractAddressAndTokenIdPojo;
import io.checknft.api.pojo.events.EventsListByContractAddressPojo;
import io.checknft.api.pojo.events.EventsListPojo;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class EventsTest extends BaseTest {

    @Test(description = "Get the list of events")
    public void getEventsList() {
        int limit = 20;
        EventsListPojo responseObject = RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .param("limit", limit)
                .when()
                .get("/api/public/v1/event")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(EventsListPojo.class);
    }

    @Test(description = "Get the list of events that belong to an account address (from/to/seller/buyer)")
    public void getEventsListByAccountAddress() {
        String address = "0x465092bBE4ca9675C1Cf9c7BF2620b2eefC77E25";
        int limit = 20;
        EventListByAccountAddressPojo responseObject = RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("address", address)
                .param("limit", limit)
                .when()
                .get("/api/public/v1/event/account/{address}")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(EventListByAccountAddressPojo.class);
    }

    @Test(description = "Get the list of events that belong to a contract address")
    public void getEventsListByContractAddress() {
        String address = "0x465092bBE4ca9675C1Cf9c7BF2620b2eefC77E25";
        int limit = 20;
        EventsListByContractAddressPojo responseObject = RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("address", address)
                .param("limit", limit)
                .when()
                .get("/api/public/v1/event/contract/{address}")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(EventsListByContractAddressPojo.class);
    }

    @Test(description = "Get the list of events that belong to a contract address and executed for a token id")
    public void getEventsListByContractAddressAndTokenId() {
        String address = "0x60E4d786628Fea6478F785A6d7e704777c86a7c6";
        String tokenId = "1";
        int limit = 20;
        EventsListByContractAddressAndTokenIdPojo responseObject = RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("tokenId", tokenId)
                .pathParam("address", address)
                .param("limit", limit)
                .when()
                .get("/api/public/v1/event/contract/{address}/{tokenId}")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(EventsListByContractAddressAndTokenIdPojo.class);
    }
}