package com.ws.config;

import com.ws.mapper.CustomerMapper;
import com.ws.repository.CustomerRepository;
import com.ws.service.CustomerService;
import com.ws.service.impl.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBean {

    @Bean
    public CustomerService customerService(CustomerRepository customerRepository, CustomerMapper customerMapper){
        return new CustomerServiceImpl(customerRepository, customerMapper);
    }

}
