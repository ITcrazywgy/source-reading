package com.source.reading.springfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Felix
 * @desc 职责描述
 * @date 2024/11/4
 */

/***
 *
 * @since:spring-plugin-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2019/05/22 15:00
 */
@Component
public class CustomerService {


    /*@Autowired
    MobileIncrementV1 mobileIncrementV1;

    public void increments(MobileCustomer mobileCustomer,int money){
        //对人员进行充值
        mobileIncrementV1.increment(mobileCustomer,money);
    }*/

    @Autowired
    private PluginRegistry<MobileIncrementBusiness, MobileCustomer> mobileCustomerPluginRegistry;


    public void increments(MobileCustomer mobileCustomer, int money) {
        //获取插件
        List<MobileIncrementBusiness> plugins = mobileCustomerPluginRegistry.getPlugins();
        for (MobileIncrementBusiness incrementBusiness : plugins) {
            //对人员进行充值
            incrementBusiness.increment(mobileCustomer, money);
        }
    }

}
