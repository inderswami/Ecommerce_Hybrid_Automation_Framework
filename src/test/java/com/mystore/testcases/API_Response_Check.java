package com.mystore.testcases;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Response_Check {


    @Test
    public void test06() {

        RestAssured.baseURI="https://reqres.in/api/user/2";
        RestAssured.given().when().get().then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
    }



}
