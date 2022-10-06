package io.checknft.api.tests;

import io.checknft.api.utils.Date;
import io.checknft.api.utils.Period;
import io.checknft.api.utils.interfaces.Unbound;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class CollectionsTest extends BaseTest {

    @Test(description = "Get the list of collections")
    public void getCollectionsList() {
        int limit = 20;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .param("limit", limit)
                .when()
                .get("/api/public/v1/collection")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the list of collections that belong to a contract address")
    public void getCollectionsListByContractAddress() {
        String address = "0x60E4d786628Fea6478F785A6d7e704777c86a7c6";
        int limit = 20;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("address", address)
                .param("limit", limit)
                .when()
                .get("/api/public/v1/collection/contract/{address}")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the statistic for all collections that belong to a contract address.")
    public void getCollectionsStatistic() {
        String address = "0x60E4d786628Fea6478F785A6d7e704777c86a7c6";
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("address", address)
                .when()
                .get("/api/public/v1/collection/contract/{address}/statistic")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the collection statistic for the period at the specific date")
    public void getSpecificDateStatistic() {
        int id = 1;
        String period = Period.Collection.ALL;
        String date = Date.format("2022-09-05 17:30:00");
        String unbound = Unbound.FALSE;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("id", id)
                .param("period", period)
                .param("date", date)
                .param("unbound", unbound)
                .when()
                .get("/api/public/v1/collection/{id}/period-statistic")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the collection statistic for several periods before the specific date (day)")
    public void getSeveralPeriodBeforeDateStatistic() {
        int id = 1;
        String period = Period.Collection.ALL;
        String date = Date.format("2022-09-05 17:30:00");
        String unbound = Unbound.FALSE;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("id", id)
                .param("period", period)
                .param("date", date)
                .param("unbound", unbound)
                .when()
                .get("/api/public/v1/collection/{id}/date-statistic")
                .then()
                .assertThat()
                .statusCode(200);
    }
}