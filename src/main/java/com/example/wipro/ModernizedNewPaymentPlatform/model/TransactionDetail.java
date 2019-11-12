package com.example.wipro.ModernizedNewPaymentPlatform.model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "TRANSACTION_DETAIL_TDS")
public class TransactionDetail {

    @Id
    @GeneratedValue
    private int transcationId;

    private String customerId;
    private String accountId;
    private String creditAmount;
    private String debitAmount;
    private String email;
    private String Address;
    private String phone;

    private LocalDate timestamp;
    private String paymentStatus;

    public TransactionDetail() {
    }

    public TransactionDetail
            (String customerId, String accountId, String creditAmount,
             String debitAmount, String email, String address,
             String phone, LocalDate timestamp, String paymentStatus) {
        this.customerId = customerId;
        this.accountId = accountId;
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
        this.email = email;
        Address = address;
        this.phone = phone;
        this.timestamp = timestamp;
        this.paymentStatus = paymentStatus;
    }

    public int getTranscationId() {
        return transcationId;
    }

    public void setTranscationId(int transcationId) {
        this.transcationId = transcationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    @Override
    public String toString() {
        return "TransactionDetail{" +
                "transcationId=" + transcationId +
                ", customerId='" + customerId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", creditAmount='" + creditAmount + '\'' +
                ", debitAmount='" + debitAmount + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + phone + '\'' +
                ", timestamp=" + timestamp +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
