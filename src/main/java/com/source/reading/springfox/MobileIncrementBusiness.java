package com.source.reading.springfox;

import org.springframework.plugin.core.Plugin;

/**
 * @author Felix
 * @desc 职责描述
 * @date 2024/11/4
 */
/***
 * 我们有电话增值业务,业务中有充值方法
 * @since:spring-plugin-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2019/05/22 14:42
 */
public interface MobileIncrementBusiness extends Plugin<MobileCustomer>{

    /***
     * 电话充值
     * @param mobileCustomer
     * @param money 金额
     */
    void increment(MobileCustomer mobileCustomer, int money);
}
