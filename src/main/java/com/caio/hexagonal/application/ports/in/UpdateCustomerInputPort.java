package com.caio.hexagonal.application.ports.in;

import com.caio.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
