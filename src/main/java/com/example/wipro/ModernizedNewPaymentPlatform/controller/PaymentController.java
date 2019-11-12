package com.example.wipro.ModernizedNewPaymentPlatform.controller;


import com.example.wipro.ModernizedNewPaymentPlatform.model.PaymentRequest;
import com.example.wipro.ModernizedNewPaymentPlatform.model.PaymentResponse;
import com.example.wipro.ModernizedNewPaymentPlatform.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payment", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    public PaymentResponse doPayment(@RequestBody PaymentRequest request){

        paymentService.startPayament(request);


    }

    @RequestMapping(value = "/getPaymentByAccountById/{id}", method = RequestMethod.GET)
    public String getPayemnt(@PathVariable("id") String id){

        return "mypayment"+id;
    }
}
