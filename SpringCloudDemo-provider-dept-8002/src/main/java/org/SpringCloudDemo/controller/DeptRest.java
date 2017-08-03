/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.controller;

import org.SpringCloudDemo.service.IDeptService;
import org.SpringCloudDemo.vo.Dept;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptRest {
  @Autowired
  private IDeptService deptService;
  @Autowired
  private DiscoveryClient client;
  
  @RequestMapping("/dept/discover")
  public Object discover() {
	  return this.client;
  }
  
  @GetMapping("/dept/sessionId") 
  public Object id(HttpServletRequest request) {
    return request.getSession().getId();
  }
  
  @GetMapping("/dept/get/{id}")
  public Object get(@PathVariable("id") long id) {
    return this.deptService.get(id);
  }
  
  @GetMapping("/dept/list")
  public Object list() {
    return this.deptService.list();
  }
  
  @RequestMapping("/dept/add") 
  public Object add(@RequestBody Dept dept) {
    return this.deptService.add(dept);
  }
}
