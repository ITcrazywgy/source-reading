package com.source.reading.springfox;

/**
 * @author Felix
 * @desc 职责描述
 * @date 2024/11/4
 */
/***
 *
 * @since:spring-plugin-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2019/05/22 14:41
 */
public class MobileCustomer {

    /***
     * 电话号码
     */
    private String tel;
    //setter getter
    /***
     * 是否老用户
     */
    private boolean old=false;

    public MobileCustomer(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }
}
