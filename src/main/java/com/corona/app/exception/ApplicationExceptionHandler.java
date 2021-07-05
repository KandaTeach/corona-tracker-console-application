package com.corona.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception exception) {
        PathRequestException pathRequestException = new PathRequestException(exception.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<Object>(pathRequestException.toString(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WebClientResponseException.class)
    public ResponseEntity<Object> handleWebClientRequestException(WebClientResponseException webClientResponseException) {
        DataSourceResponseException clientResponseException = new DataSourceResponseException(webClientResponseException.getMessage(), HttpStatus.BAD_REQUEST);
        return new ResponseEntity<Object>(clientResponseException.toString(), HttpStatus.BAD_REQUEST);
    }

}
