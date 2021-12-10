package com.example.springrestapp.services;

import com.example.springrestapp.exception.NotEnoughMoneyException;
import com.example.springrestapp.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
