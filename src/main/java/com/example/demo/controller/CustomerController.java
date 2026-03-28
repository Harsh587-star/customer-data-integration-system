package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.integration.IntegrationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;
    private final IntegrationService integrationService;

    public CustomerController(CustomerService service, IntegrationService integrationService) {
        this.service = service;
        this.integrationService = integrationService;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @GetMapping
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping("/sync")
    public String sync(@RequestBody Customer customer) {
        return integrationService.syncCustomer(customer);
    }
}
