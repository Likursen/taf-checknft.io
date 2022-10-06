package io.checknft.api.tests;

import io.checknft.api.utils.Period;
import io.restassured.RestAssured;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TokensTest extends BaseTest {

    @Test(description = "Get the list of NFTs")
    public void getNftList() {
        int limit = 20;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .param("limit", limit)
                .when()
                .get("/api/public/v1/token")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the list of NFTs owned by an account address")
    public void getNftListByAccountAddress() {
        String address = "0x465092bBE4ca9675C1Cf9c7BF2620b2eefC77E25";
        int limit = 20;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("address", address)
                .param("limit", limit)
                .when()
                .get("/api/public/v1/token/owner/{address}")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the list of NFTs that belong to a contract address")
    public void getNftListByContractAddress() {
        String address = "0x60E4d786628Fea6478F785A6d7e704777c86a7c6";
        int limit = 20;
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("address", address)
                .param("limit", limit)
                .when()
                .get("/api/public/v1/token/contract/{address}")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the NFT that belongs to a contract address and has token id")
    public void getNftListByContractAddressAndTokenId() {
        String address = "0x60E4d786628Fea6478F785A6d7e704777c86a7c6";
        String tokenId = "1";
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("tokenId", tokenId)
                .pathParam("address", address)
                .when()
                .get("/api/public/v1/token/contract/{address}/{tokenId}")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test(description = "Get the NFT amount owned by an account address")
    public void getNftAmountByAccountAddress() {
        JSONObject body = new JSONObject();
        JSONArray addresses = new JSONArray();
        addresses.put("0x465092bBE4ca9675C1Cf9c7BF2620b2eefC77E25");
        body.put("addresses", addresses);
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

    @Test(description = "Get the statistic of NFT for a period.")
    public void getNftStatisticForPeriod() {
        String period = Period.Nft.YEAR;
        String tokenId = "1";
        RestAssured.given()
                .header("X-API-KEY", TOKEN)
                .header("accept", "*/*")
                .pathParam("tokenId", tokenId)
                .param("period", period)
                .when()
                .get("api/public/v1/token/{tokenId}/price")
                .then()
                .assertThat()
                .statusCode(200);
    }
}