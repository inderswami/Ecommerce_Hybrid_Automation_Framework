package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Patch_Method_API_Automation {
    @Test
    public void test05() {

        JSONObject jsondata=new JSONObject();
        jsondata.put("name", "Neraj");
        jsondata.put("job", "CEO");

        RestAssured.baseURI="https://reqres.in/api/user/838";
        RestAssured.given().header("Contnent-Type","application/json").
                contentType(ContentType.JSON).
                body(jsondata).
                when().patch().then().statusCode(200).log().all();











    }




}
