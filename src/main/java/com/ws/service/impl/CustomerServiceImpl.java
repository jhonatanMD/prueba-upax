package com.ws.service.impl;

import com.ws.mapper.CustomerMapper;
import com.ws.model.Buyers;
import com.ws.repository.CustomerRepository;
import com.ws.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.Collectors;


@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;


    @Override
    public Buyers findAll() {

        Buyers buyers = new Buyers();
        buyers.setCustomers(
        customerRepository.findAll().stream().map(customerMapper::toDto)
                .collect(Collectors.toList()));
        return buyers;
    }

}
