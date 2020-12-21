package com.spring.models;

import org.springframework.beans.factory.annotation.Lookup;

public abstract  class RequestProcessor {
	  public RequestValidator handleRequest(String requestId){
	        System.out.println("Request ID : "+ requestId);
	        RequestValidator validator = createValidator(); //here Spring will create new instance of prototype bean
	        validator.validate(requestId);
	        return validator;
	    }
	  @Lookup
	    protected abstract  RequestValidator createValidator();
}
