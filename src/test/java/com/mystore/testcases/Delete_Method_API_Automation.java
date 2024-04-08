package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Delete_Method_API_Automation {

    @Test
    public void test06() {
// To delete resource need to provide the id here 838 is given .but To run this need to provide the existing resource id
        RestAssured.baseURI="https://reqres.in/api/user/838";
        RestAssured.given().header("Contnent-Type","application/json").
                contentType(ContentType.JSON).
                when().delete().then().statusCode(204).log().all();

    }



}
