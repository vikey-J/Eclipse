package com.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Validation {
	
	public static void main(String[] args) throws  Throwable {
		File f= new File("C:\\Users\\my pc\\eclipse-workspace\\TestNG\\src\\test\\java\\com\\payload\\payload.json");
		FileReader reader=new FileReader(f);
		JSONParser parser=new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobject=(JSONObject)parse;
		Object object = jsonobject.get("Team");
		String value = object.toString();
		System.out.println("Team : "+value);
		
	}

}
