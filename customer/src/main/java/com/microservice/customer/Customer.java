package com.microservice.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    public long id ;
    public String name;
    public  String email;
    public String phone;
}
