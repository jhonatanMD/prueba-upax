package com.ws.controller;

import com.ws.model.Buyers;
import com.ws.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.BuyersApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AppController implements BuyersApi {

    private final CustomerService customerService;
    @Override
    public ResponseEntity<Buyers> buyersGet() {
        System.out.println("hola");
        return ResponseEntity.ok().body(customerService.findAll());
    }
}
