package com.example.springrestapp.controllers.advices;

import com.example.springrestapp.exception.NotEnoughMoneyException;
import com.example.springrestapp.models.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler(){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to take payment");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
