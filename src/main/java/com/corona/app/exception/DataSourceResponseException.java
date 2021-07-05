package com.corona.app.exception;

import org.springframework.http.HttpStatus;

public class DataSourceResponseException {

    private String message;
    private HttpStatus httpStatus;

    public DataSourceResponseException() {
        super();
    }

    public DataSourceResponseException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String toString() {
        return "Data does not exist try another one\n\n" + 
                "EXCEPTION INFORMATION\n" + 
                "Message: " + message + "\n" + 
                "StatusCode: " + httpStatus + "\n\n";
    }

}
