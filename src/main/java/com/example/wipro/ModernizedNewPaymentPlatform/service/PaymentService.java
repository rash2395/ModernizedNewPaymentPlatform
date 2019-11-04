package com.example.wipro.ModernizedNewPaymentPlatform.service;

import com.example.wipro.ModernizedNewPaymentPlatform.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
}
