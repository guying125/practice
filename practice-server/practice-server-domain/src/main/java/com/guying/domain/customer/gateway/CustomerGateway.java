package com.guying.domain.customer.gateway;

import com.guying.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
