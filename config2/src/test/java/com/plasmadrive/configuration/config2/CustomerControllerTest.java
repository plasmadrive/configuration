package com.plasmadrive.configuration.config2;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {
    private final String customerJson = "{\"firstName\" : \"Fred\", \"lastName\" : \"Foobar\"}";
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CustomerService customerService;


    @Test
    public void testGetCustomerByFirstName() throws Exception {

        given(this.customerService.getCustomerByFirstName("Fred"))
                .willReturn(new Customer("Fred","Foobar"));
        mvc.perform(MockMvcRequestBuilders.get("/customer?firstName=Fred"))
                .andExpect(content().json(customerJson));


    }
}
