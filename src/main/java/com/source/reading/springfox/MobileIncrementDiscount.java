package com.source.reading.springfox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author Felix
 * @desc 职责描述
 * @date 2024/11/4
 */
public class MobileIncrementDiscount implements MobileIncrementBusiness {
    Logger logger= LoggerFactory.getLogger(MobileIncrementDiscount.class);
    @Override
    public void increment(MobileCustomer mobileCustomer, int money) {
        if (supports(mobileCustomer)){
            logger.info("老用户折扣");
            if (money>100){
                if (money>100){
                    BigDecimal big=new BigDecimal(money).multiply(new BigDecimal(0.1));
                    logger.info("当前充值金额>100元,返冲{}元",big.intValue());
                }
            }
        }
    }

    /***
     * 来用户才满足
     * @param delimiter
     * @return
     */
    @Override
    public boolean supports(MobileCustomer delimiter) {
        return delimiter.isOld();
    }
}
