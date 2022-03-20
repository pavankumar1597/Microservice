package com.microservice.fraud;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class FraudCheckResponse{

     boolean isFraudster;

    public FraudCheckResponse(boolean isFraudulentCustomer) {

    isFraudster = isFraudulentCustomer ;
    }
}