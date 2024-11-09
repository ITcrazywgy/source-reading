package com.source.reading;

import com.source.reading.springfox.CustomerService;
import com.source.reading.springfox.MobileCustomer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SourceReadingApplication {



    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SourceReadingApplication.class, args);
        CustomerService customerService=context.getBean(CustomerService.class);
        MobileCustomer mobileCustomer=new MobileCustomer("13567662664");
        mobileCustomer.setOld(true);
        customerService.increments(mobileCustomer,120);
    }

}
