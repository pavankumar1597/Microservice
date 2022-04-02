package com.microservice.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository ;


    @Autowired
    RestTemplate restTemplate ;
    public  void  registerCustomer(CustomerRequest customerRequest){
        Customer customer = Customer.builder().name(customerRequest.name()).email(customerRequest.email()).phone(customerRequest.phone()).build();
    //todo check email is valid
        // check email is not taken
        // store customer in db
        customerRepository.saveAndFlush(customer);

        FruadCheckResponce fraud = restTemplate.getForObject("http://FRUAD/api/v1/fraud-check/{customerId}", FruadCheckResponce.class, customer.getIds());
    if(fraud.isFraudster()){
        new IllegalStateException("he is a fruadster");

    }


    }

    public Iterator<Customer> get() {

     return   customerRepository.findAll().iterator();
    }
}
