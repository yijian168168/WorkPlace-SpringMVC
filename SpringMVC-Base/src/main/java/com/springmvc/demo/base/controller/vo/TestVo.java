package com.springmvc.demo.base.controller.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ZhangQingrong
 * @date 2018/2/13 16:31
 */
@XmlRootElement(name = "TestVo")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestVo {

    private String name;

    public TestVo() {
    }

    public TestVo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestVo{" +
                "name='" + name + '\'' +
                '}';
    }
}
