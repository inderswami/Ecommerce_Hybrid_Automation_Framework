package com.mystore.testcases;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Performance_Test_API_automation {

        @Test
        public void responsetime() {
            //base URI with Rest Assured class
            RestAssured.baseURI ="https://httpbin.org/";
            //input details
            RequestSpecification r = RestAssured.given();
            // GET request
            Response res = r.get();
            //obtain Response as string
            String j = res.asString();
            //get response time
            long c = res.getTime();
            System.out.println("Response time in milliseconds: " + c);
        }
    }






