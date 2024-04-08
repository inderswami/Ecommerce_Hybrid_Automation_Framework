package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Put_Method_API_Automation {

    @Test
    public void test04() {
        JSONObject jsondata=new JSONObject();
        jsondata.put("name", "Sheetal");
        jsondata.put("job", "Teacher");

        RestAssured.baseURI="https://reqres.in/api/user";
        RestAssured.given().header("Contnent-Type","application/json").
                contentType(ContentType.JSON).
                body(jsondata).
                when().post().then().statusCode(201).log().all();



    }

}
