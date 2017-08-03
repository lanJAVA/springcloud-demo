/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.controller;

import java.util.List;

import org.SpringCloudDemo.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerDeptController {
  
  public static final String DEPT_GET_URL = "http://DEPT-SERVICE/dept/get/";
  public static final String DEPT_LIST_URL = "http://DEPT-SERVICE/dept/list/";
  public static final String DEPT_ADD_URL = "http://DEPT-SERVICE/dept/add";
  
  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private HttpHeaders headers;
  
  @RequestMapping("/consumer/dept/get")
  public Object getDept(long id) {
//    Dept dept = this.restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
    Dept dept = this.restTemplate.exchange(DEPT_GET_URL + id, HttpMethod.GET, 
         new HttpEntity<Object>(this.headers), Dept.class).getBody();
    return dept;
  }
  
  @SuppressWarnings("unchecked")
  @RequestMapping("/consumer/dept/list")
  public Object listDept() {
//    List<Dept> allDepts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
    List<Dept> allDepts = this.restTemplate.exchange(DEPT_LIST_URL, HttpMethod.GET,
        new HttpEntity<Object>(this.headers), List.class).getBody();
    return allDepts;
  }
  
  @RequestMapping("/consumer/dept/add")
  public Object addDept(Dept dept) {
//    Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
    Boolean flag = this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST,
        new HttpEntity<Object>(dept, this.headers), Boolean.class).getBody();
    return flag;
  }
  
}
