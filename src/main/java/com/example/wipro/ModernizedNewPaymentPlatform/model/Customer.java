package com.example.wipro.ModernizedNewPaymentPlatform.model;

public class Customer {
    private int accountId;
    private String customerId;
    private String password;
    private String balanceAmount;
    private String email;
    private String Address;
    private String phone;

    public Customer() {
    }

    public Customer(int accountId, String customerId, String password, String balanceAmount, String email, String address, String phone) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.password = password;
        this.balanceAmount = balanceAmount;
        this.email = email;
        Address = address;
        this.phone = phone;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
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

    @Override
    public String toString() {
        return "Customer{" +
                "accountId=" + accountId +
                ", customerId='" + customerId + '\'' +
                ", password='" + password + '\'' +
                ", balanceAmount='" + balanceAmount + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
