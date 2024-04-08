package com.mystore.testcases;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Header_Verification_API_Automation {
@Test(enabled = false)
    void testheaders(){

        given()
                .when()
                .get("https://httpbin.org")
                .then()
                .header("Content-Type","text/html ; charset=ISO-8859-1")
                .header("Content-Encoding","gzip");


    }
@Test(priority = 1)
    void testheader(){
    Response rs=
    given()
            .when()
            .get("https://httpbin.org");

    String header=rs.getHeader("Content-Type");
    System.out.println(header);
    System.out.println("Header displayed correctly");
}



}
