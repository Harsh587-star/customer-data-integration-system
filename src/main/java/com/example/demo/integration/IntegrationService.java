package com.example.demo.integration;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    public String syncCustomer(Customer customer) {
        return "Customer synced: " + customer.getName();
    }
}
