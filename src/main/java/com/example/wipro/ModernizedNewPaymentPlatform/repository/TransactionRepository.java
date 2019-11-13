package com.example.wipro.ModernizedNewPaymentPlatform.repository;

import com.example.wipro.ModernizedNewPaymentPlatform.model.TransactionDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<String,TransactionDetail> {

    TransactionDetail save(TransactionDetail detail);

    List<TransactionDetail> findByAccountId(String accountId);


}
