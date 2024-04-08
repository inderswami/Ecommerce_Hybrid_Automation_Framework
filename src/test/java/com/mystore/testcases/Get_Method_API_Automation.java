package com.mystore.testcases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Get_Method_API_Automation {

        @Test
        public void testName() {

            Response response= RestAssured.get("https://reqres.in/api/user?page=2");
            System.out.println("Response code"+response.getStatusCode());
            System.out.println("Response code:"+response.getBody().asString());
            System.out.println("Response code:"+response.getTime());
            System.out.println("Response code:"+response.getHeader("Content-type"));

            int statuscode= response.statusCode();
        }



    }





