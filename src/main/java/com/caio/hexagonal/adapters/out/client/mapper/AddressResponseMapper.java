package com.caio.hexagonal.adapters.out.client.mapper;

import com.caio.hexagonal.adapters.out.client.response.AddressResponse;
import com.caio.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
