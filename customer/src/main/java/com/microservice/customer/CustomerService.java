package com.microservice.customer;

public record CustomerService() {

    public  void  registerCustomer(CustomerRequest customerRequest){
        Customer customer = Customer.builder().name(customerRequest.name()).email(customerRequest.email()).phone(customerRequest.phone()).build();
    //todo check email is valid
        // check email is not taken
        // store customer in db



    }
}
