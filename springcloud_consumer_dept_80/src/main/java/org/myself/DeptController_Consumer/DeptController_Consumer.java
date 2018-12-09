package org.myself.DeptController_Consumer;

import org.myself.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    /**
     * RestTemplate提供了多种便捷方式的远程访问的服务方式，编辑的restful
     * 服务模板类，是spring提供用于访问Rest服务的客户端工具类
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * URL:REST请求地址
     * requestMap：请求参数
     * ResponseBean.class:HTTP响应转换成对象类型
     */
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
}
