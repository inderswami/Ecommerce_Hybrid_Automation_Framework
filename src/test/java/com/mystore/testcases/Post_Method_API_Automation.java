package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Post_Method_API_Automation {
        @Test
        public void test03(){

            JSONObject jsondata=new JSONObject();
            jsondata.put("name", "Inder");
            jsondata.put("job", "QA");

            RestAssured.baseURI="https://reqres.in/api/user/838";
            RestAssured.given().header("Contnent-Type","application/json").
                    contentType(ContentType.JSON).
                    body(jsondata).
                    when().put().then().statusCode(200).log().all();



        }

    }








