package ai.chat.wildflydemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ai.chat.wildflydemo.model.Customer;
import ai.chat.wildflydemo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
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
