package com.example.wipro.ModernizedNewPaymentPlatform.service;

import com.example.wipro.ModernizedNewPaymentPlatform.Exception.AccountNotFoundException;
import com.example.wipro.ModernizedNewPaymentPlatform.Exception.BalanceNotSufficientException;
import com.example.wipro.ModernizedNewPaymentPlatform.model.Customer;
import com.example.wipro.ModernizedNewPaymentPlatform.model.PaymentRequest;
import com.example.wipro.ModernizedNewPaymentPlatform.model.PaymentResponse;
import com.example.wipro.ModernizedNewPaymentPlatform.repository.PaymentRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.transaction.TransactionScoped;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional(rollbackFor = Exception.class)
    public PaymentResponse startPayment(PaymentRequest request){
        //check from and to account id exist
        validateFromAndToAccount(request);

        //check balance is available or not.
        checkBalance(request);

        paymentRepository.updateFromAccount(request.getBalance(), request.getFromAccountId());
        paymentRepository.updateToAccount(request.getBalance(),  request.getToAccountId());

        //after sucessful transcation store txn in to txn table.



        return mappedResponse(request);



    }

    private void validateFromAndToAccount(PaymentRequest request){
        Customer customer=null;
        customer= paymentRepository.findByAccountId(request.getFromAccountId());
        if(!StringUtils.equals(customer.getAccountId(),request.getFromAccountId())){
            throw new AccountNotFoundException("From account Not Found");
        }

        customer=paymentRepository.findByAccountId(request.getToAccountId());
        if(customer==null){
            throw new AccountNotFoundException("To Account Not Found");
        }

    }

    private void checkBalance(PaymentRequest request){
       Customer customer= paymentRepository.findByAccountId(request.getFromAccountId());
       if(customer.getBalanceAmount()>request.getBalance()==false){
           throw new BalanceNotSufficientException("Balance is not sufficent to intiate transaction.");
       }

    }

    private PaymentResponse


}
