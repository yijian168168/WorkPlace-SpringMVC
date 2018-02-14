package com.springmvc.demo.base.controller;

import com.springmvc.demo.base.controller.vo.TestVo;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * RequestMapping注解详解
 *
 * 1、value属性代表请求的url映射地址
 * 2、method属性代表对http请求方式的限定，例如：GET, POST, HEAD, OPTIONS, PUT, PATCH, DELETE, TRACE
 * 3、headers属性代表对请求头的限定，例如：headers = "content-type=application/json" headers != "content-type=application/json"
 * 4、params属性代表对请求参数的限定，例如：,params={"paramA=A","paramB!=B","!paramC"}
 * 5、consumes属性对应请求头中的 ‘Accept’请求头，可以接收的返回内容格式
 * 6、produces属性指定响应内容格式
 *
 * @author ZhangQingrong
 * @date 2018/2/14 11:16
 */
@Controller
public class RequestMappingController {

    /**
     * 请求是json,返回是json
     */
    @RequestMapping(value = "test", headers = "content-type=application/json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public TestVo testJson(@RequestBody TestVo testVo) {
        System.out.println("testJson......................" + testVo);
        return new TestVo("testJson");
    }

    /**
     * 请求是json,返回是txt
     */
    @RequestMapping(value = "test", headers = "content-type=application/json", consumes = MediaType.TEXT_HTML_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String testRequestJsonReturnTxt(@RequestBody TestVo testVo) {
        System.out.println("testRequestJsonReturnTxt......................" + testVo);
        return "testRequestJsonReturnTxt";
    }

    /**
     * 请求是json,返回是xml
     */
    @RequestMapping(value = "test", headers = "content-type=application/json", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public TestVo testRequestJsonReturnXml(@RequestBody TestVo testVo) {
        System.out.println("testRequestJsonReturnXml......................" + testVo);
        return new TestVo("testRequestJsonReturnXml");
    }

    /**
     * 请求是xml,返回是xml
     */
    @RequestMapping(value = "test", headers = "content-type=application/xml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public TestVo testXml(@RequestBody TestVo testVo) {
        System.out.println("testXml......................" + testVo);
        return new TestVo("testXml");
    }

    /**
     * 请求是xml，返回txt
     */
    @RequestMapping(value = "test", headers = "content-type=application/xml", consumes = MediaType.TEXT_HTML_VALUE, produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String testRequestXmlReturnTxt(@RequestBody TestVo testVo) {
        System.out.println("testRequestXmlReturnTxt......................" + testVo);
        return "testRequestXmlReturnTxt";
    }

    /**
     * 请求是xml,返回是json
     */
    @RequestMapping(value = "test", headers = "content-type=application/xml", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public TestVo testRequestXmlReturnJson(@RequestBody TestVo testVo) {
        System.out.println("testRequestXmlReturnJson......................" + testVo);
        return new TestVo("testRequestXmlReturnJson");
    }


}
