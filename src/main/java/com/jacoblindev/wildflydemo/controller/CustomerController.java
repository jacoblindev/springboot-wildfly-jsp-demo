package com.jacoblindev.wildflydemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jacoblindev.wildflydemo.model.Customer;
import com.jacoblindev.wildflydemo.repository.CustomerRepository;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @PostMapping("/customers/add")
    public List<Customer> addCustomer(@RequestBody Customer customer) {
        log.info("Adding customer: {}", customer.getFirstName() + customer.getLastName());

        Customer newCustomer = new Customer(); 
        newCustomer.setFirstName(customer.getFirstName()); 
        newCustomer.setLastName(customer.getLastName()); 

        log.info("Saving new customer..."); 

        customerRepository.save(newCustomer); 

        return customerRepository.findAll();
    }
}
