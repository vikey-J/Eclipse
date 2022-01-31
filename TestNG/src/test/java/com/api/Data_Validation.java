package com.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Data_Validation{
	@Test
	public void data_Validation() {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users?page=2");
		String responseBody = response.asString();
		System.out.println(responseBody);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code : "+statusCode);
		Assert.assertEquals(200, statusCode);
		System.out.println("Data Validation SucessFully");
		
	}
	
	
	
}