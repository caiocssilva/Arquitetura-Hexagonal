package com.caio.hexagonal.adapters.in.controller.response;

import com.caio.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Address address;

    private String cpf;

    private Boolean isValidCpf;

}
