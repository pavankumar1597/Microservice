package com.microservice.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@Slf4j
@RestController
@RequestMapping("customer")
public record CustomerController(CustomerService customerService) {

    @PostMapping("/saveme")
    public void registerCustomer(@RequestBody  CustomerRequest customerRequest) {
        log.info("new Customer ",customerRequest);
        customerService.registerCustomer(customerRequest);

    }
    @GetMapping("/get")
    public Iterator<Customer> get() {
        return customerService.get();

    }

}
