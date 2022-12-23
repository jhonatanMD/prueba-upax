package com.ws.mapper;

import com.ws.model.Buyer;
import com.ws.repository.model.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface CustomerMapper {


    Buyer toDto (CustomerEntity entity);

}
