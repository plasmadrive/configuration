package com.plasmadrive.configuration.config2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface  CustomerRepository extends CrudRepository<Customer,Long>  {
    Customer findCustomerByFirstName(String firstName);
    Customer findCustomerByLastName(String lastName);
}
