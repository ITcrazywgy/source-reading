package com.source.reading.springfox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * 第一版本的充值系统
 * @since:spring-plugin-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2019/05/22 14:44
 */
/*public class MobileIncrementV1 implements MobileIncrementBusiness {

    Logger logger= LoggerFactory.getLogger(MobileIncrementV1.class);

    @Override
    public void increment(MobileCustomer mobileCustomer, int money) {
        logger.info("给{}充值电话费,充值金额:{}",mobileCustomer.getTel(),money);
        logger.info("充值完成.");
    }
}*/

public class MobileIncrementV1 implements MobileIncrementBusiness {

    Logger logger= LoggerFactory.getLogger(MobileIncrementV1.class);

    @Override
    public void increment(MobileCustomer mobileCustomer, int money) {
        logger.info("给{}充值电话费,充值金额:{}",mobileCustomer.getTel(),money);
        logger.info("充值完成.");
    }

    @Override
    public boolean supports(MobileCustomer delimiter) {
        return true;
    }
}