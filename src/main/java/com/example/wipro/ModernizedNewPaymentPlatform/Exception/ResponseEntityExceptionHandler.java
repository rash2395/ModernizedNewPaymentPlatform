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

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleAccountNotException(Exception ex){

        ExceptionResponse response=new ExceptionResponse(new Date(), ex.getMessage(), "account not exist");

        return new ResponseEntity<ExceptionResponse>(response,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BalanceNotSufficientException.class)
    public ResponseEntity<ExceptionResponse> handlebalanceinsufficientException(Exception ex){

        ExceptionResponse response=new ExceptionResponse(new Date(), ex.getMessage(),
                "Balance is not suffcient to intiate payment");

        return new ResponseEntity<ExceptionResponse>(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleException(Exception ex){

        ExceptionResponse response=new ExceptionResponse(new Date(), ex.getMessage(),
                "Internal Server Error");

        return new ResponseEntity<ExceptionResponse>(response,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
