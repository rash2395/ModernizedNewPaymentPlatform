package com.example.wipro.ModernizedNewPaymentPlatform.Exception;


import com.example.wipro.ModernizedNewPaymentPlatform.model.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.Date;

@RestControllerAdvice
public class ResponseEntityExceptionHandler {

    @ExceptionHandler(AuthorizationException.class)
    public ResponseEntity<ExceptionResponse> handleAuthException(Exception ex){

        ExceptionResponse response=new ExceptionResponse(new Date(), ex.getMessage(), "CustomerId or Password is not correct");

        return new ResponseEntity<ExceptionResponse>(response,HttpStatus.UNAUTHORIZED);
    }
}
