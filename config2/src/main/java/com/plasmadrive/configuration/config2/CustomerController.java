package com.plasmadrive.configuration.config2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customer")
    public Customer getCustomerByFirstName(@RequestParam("firstName") String firstName) {
        logger.info("Received Request for first Name: " + firstName);
        return customerService.getCustomerByFirstName(firstName);
    }

    /**
    @RequestMapping("/customer")
    public Customer getCustomerByLastName(@RequestParam("lastName") String lastName) {
        return customerService.getCustomerByFirstName(lastName);
    }

    */
}
