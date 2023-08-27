package com.rena.service;


import com.rena.dto.request.CustomerRegistrationRequest;

public interface CustomerService {
    public String registerUser(CustomerRegistrationRequest request);
}
