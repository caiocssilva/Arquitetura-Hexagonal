package com.caio.hexagonal.application.core.usecase;

import com.caio.hexagonal.application.core.domain.Customer;
import com.caio.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.caio.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.caio.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import com.caio.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdOutputPort findCustomerByIdOutputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort
    ) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdOutputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }

}
