package com.plasmadrive.configuration.config2;

import org.springframework.stereotype.Service;


public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerByFirstName(String firstName){
        return customerRepository.findCustomerByFirstName(firstName);
    }

    public Customer getCustomerByLastName(String lastName) {
        return customerRepository.findCustomerByLastName(lastName);
    }
}
