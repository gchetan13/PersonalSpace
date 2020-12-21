package com.spring.models;

public class RequestValidator {
	private static int count=0;
	public RequestValidator() {
		count++;
        System.out.println("Constructor:: RequestValidator instance created!");
    }

    // Validates the request and populates error messages
    public void validate(String requestId){
        System.out.println("RequestValidator :"+requestId);
        System.out.println("RequestValidator Conut:"+count);
    }
}
