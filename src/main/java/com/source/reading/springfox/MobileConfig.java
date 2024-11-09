package com.source.reading.springfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;

/**
 * @author Felix
 * @desc 职责描述
 * @date 2024/11/4
 */
@Configuration
@EnablePluginRegistries({MobileIncrementBusiness.class})
public class MobileConfig {


    @Bean
    public MobileIncrementV1 mobileIncrementV1(){
        return new MobileIncrementV1();
    }

    @Bean
    public MobileIncrementDiscount mobileIncrementDiscount(){
        return new MobileIncrementDiscount();
    }
}
