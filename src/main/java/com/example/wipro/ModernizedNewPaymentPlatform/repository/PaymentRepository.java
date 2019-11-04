package com.example.wipro.ModernizedNewPaymentPlatform.repository;

import com.example.wipro.ModernizedNewPaymentPlatform.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<Integer, Customer> {




}
