package com.example.wipro.ModernizedNewPaymentPlatform.security;

import com.example.wipro.ModernizedNewPaymentPlatform.model.Customer;
import com.example.wipro.ModernizedNewPaymentPlatform.service.AuthorizationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class Authorization extends HandlerInterceptorAdapter {

    @Autowired
    private AuthorizationService authService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String customerId= request.getHeader("customerID");
        boolean isAuthenticated=false;

        List<Customer> customers=authService.getCustomers();
        boolean customerExist=false;
        boolean isPasswordCorrect=false;
        for(Customer customer:customers){
            if(customer.getCustomerId().equals(customerId)){
                customerExist=true;
            }
        }

        String password = authService.findPasswordForCustomerId( request.getHeader("customerId"));
        if(StringUtils.equalsIgnoreCase(password,request.getHeader("password"))){
            isPasswordCorrect=true;
        }

        if(customerExist&& isPasswordCorrect){
            isAuthenticated=true;
        }

        return isAuthenticated;
    }
}
