package com.springmvc.demo.base.controller.vo;

import javax.xml.bind.annotation.*;

/**
 * 创建订单请求对象
 *
 * @author ZhangQingrong
 * @date 2018/1/11 9:55
 */
@XmlRootElement(name = "order_create_req")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCreateReqVo {
    /**
     * 商户号
     */
    @XmlElement
    private String merchant_no;

    public String getMerchant_no() {
        return merchant_no;
    }

    public void setMerchant_no(String merchant_no) {
        this.merchant_no = merchant_no;
    }
}
