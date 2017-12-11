package com.springmvc.validator.dto;

import com.springmvc.validator.annotation.Money;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Created by ZhangQingrong on 2017/6/7.
 */
public class Person {

    @NotBlank(message = "姓名不能为空")
    private String name;

    @Min(value = 18, message = "年龄不能小于18")
    @NotBlank(message = "年龄不能为空")
    private String age;

    @Money(message="标准的金额形式为xxx.xx")
    @NotBlank(message = "金额不能为空")
    private String money;

    /**
     * 13,15,18开头的11位数
     * */
    @Pattern(regexp = "((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$", message = "手机号有误")
    @NotBlank(message = "手机号不能为空")
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", money='" + money + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
