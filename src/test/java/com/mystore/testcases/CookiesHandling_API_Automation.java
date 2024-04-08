package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CookiesHandling_API_Automation {

    @Test
    public void cookieshandling() {

//        Response response= RestAssured.get("https://reqres.in/api/user?page=2");
//        System.out.println("Response code"+response.getStatusCode());
//        System.out.println("Response code:"+response.getBody().asString());
//        System.out.println("Response code:"+response.getTime());
//        System.out.println("Response code:"+response.getHeader("Content-type"));
//
//        int statuscode= response.statusCode();
        Response rs=
given().cookie("skill1","Rest assured update is here").baseUri("https://httpbin.org/cookies/set?free=cookie")
                .log().all().when().get();
        String cookies_value=rs.getCookie("Skill1");
        System.out.println("Cookies Updated Correctly");




    }





}
