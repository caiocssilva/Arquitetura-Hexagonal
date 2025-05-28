package com.caio.hexagonal.adapters.out.client.mapper;

import com.caio.hexagonal.adapters.out.client.response.AddressResponse;
import com.caio.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
