package com.example.wipro.ModernizedNewPaymentPlatform.repository;

import com.example.wipro.ModernizedNewPaymentPlatform.model.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<String, Customer> {

    public Iterable<Customer> findAll();

    Customer findByAccountId(String accountId);

    @Query(value = "select PASSWORD from CUSTOMER Where CUSTOMER_ID=?1" , nativeQuery = true)
    public String getPassword(String customerId);



    @Modifying
    @Query(value = "UPDATE ACCOUNT SET BALANCE_AMOUNT = BALANCE_AMOUNT-?1 WHERE ACCOUNT_ID = ?2", nativeQuery = true)
    @Transactional
    public void updateFromAccount(double amount,String accountId);

    @Modifying
    @Query(value = "UPDATE ACCOUNT SET BALANCE_AMOUNT = BALANCE_AMOUNT+?1 WHERE ACCOUNT_ID = ?2", nativeQuery = true)
    @Transactional
    public void updateToAccount(double amount,String accountId);








}
