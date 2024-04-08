package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Concurrent_User {
    @Test()
    public void ConcurrentUser() {

        Response response= RestAssured.get("https://httpbin.org/get");
        System.out.println("Response code"+response.getStatusCode());
        System.out.println("Response code:"+response.getBody().asString());
        System.out.println("Response code:"+response.getTime());
        System.out.println("Response code:"+response.getHeader("Content-type"));

        int statuscode= response.statusCode();
        System.out.println(statuscode);
    }


}
