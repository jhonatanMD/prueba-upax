package com.ws.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Table(name = "customers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @Column(name = "customer_number")
    private Long customerNumber;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "contact_last_name")
    private String contactLastName;


    @Column(name = "contact_first_name")
    private String contactFirstName;
    private String phone;
    @Column(name = "address_line_1")
    private String addressLine1;


    @Column(name = "address_line_2")
    private String address_line_2;
    private String city;


    private String state;
    @Column(name = "postal_code")
    private String postalCode;
    private String country;
    @Column(name = "sales_rep_employee_number")
    private String salesRepEmployeeNumber;
    @Column(name = "credit_limit")
    private String creditLimit;
}

