package com.spring.cloudfunctions;

import java.util.function.Function;

public class Hello implements Function<String, String>{
	
// to call this class as endpoint we need to scan the package using a property in application.properties file
	
	
//	curl -H "Content-Type text/plain" http://localhost:8080/hello -d "message"
	@Override
	public String apply(String message) {
		// TODO Auto-generated method stub
		return "apply method called :"+ message;
	}
	

}
