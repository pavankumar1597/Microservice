package com.microservice.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

@NoArgsConstructor
public class FruadCheckResponce {


    boolean fraudster;

    public FruadCheckResponce(boolean isFraudulentCustomer) {

        fraudster = isFraudulentCustomer ;
    }
}
