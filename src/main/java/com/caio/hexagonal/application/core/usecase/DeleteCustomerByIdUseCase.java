package com.caio.hexagonal.application.core.usecase;

import com.caio.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import com.caio.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdOutputPort findCustomerByIdOutputPort,
            DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
    ) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    public void delete(String id) {
        findCustomerByIdOutputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }

}
