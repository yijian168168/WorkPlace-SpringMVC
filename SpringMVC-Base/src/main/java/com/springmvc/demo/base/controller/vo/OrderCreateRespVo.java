package com.springmvc.demo.base.controller.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 交易中心下单响应对象
 *
 * @author ZhangQingrong
 * @date 2018/1/8 10:58
 */
@XmlRootElement(name = "order_create_resp")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderCreateRespVo implements Serializable{
    /**
     * 商家号
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
