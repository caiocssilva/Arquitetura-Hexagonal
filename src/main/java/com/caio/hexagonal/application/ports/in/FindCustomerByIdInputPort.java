package com.caio.hexagonal.application.ports.in;

import com.caio.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
