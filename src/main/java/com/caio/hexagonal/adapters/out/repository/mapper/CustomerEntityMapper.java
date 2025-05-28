package com.caio.hexagonal.adapters.out.repository.mapper;

import com.caio.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.caio.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
