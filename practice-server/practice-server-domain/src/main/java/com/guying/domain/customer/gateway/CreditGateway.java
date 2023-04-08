package com.guying.domain.customer.gateway;

import com.guying.domain.customer.Customer;
import com.guying.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
