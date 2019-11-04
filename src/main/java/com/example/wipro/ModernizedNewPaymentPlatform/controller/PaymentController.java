package com.example.wipro.ModernizedNewPaymentPlatform.controller;


import com.example.wipro.ModernizedNewPaymentPlatform.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/getPaymentByAccountById/{id}", method = RequestMethod.GET)
    public String getPayemnt(@PathVariable("id") String id){

        return "mypayment"+id;
    }
}
