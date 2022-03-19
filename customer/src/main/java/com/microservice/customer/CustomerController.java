package com.microservice.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
public record CustomerController(CustomerService customerService) {

    public void registerCustomer(CustomerRequest customerRequest) {

        log.info("new Customer ",customerRequest);

    }

}
