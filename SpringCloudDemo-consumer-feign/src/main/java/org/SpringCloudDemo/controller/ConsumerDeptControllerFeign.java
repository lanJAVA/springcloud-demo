/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.controller;


import org.SpringCloudDemo.service.IDeptClientService;
import org.SpringCloudDemo.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerDeptControllerFeign {
	@Autowired
	private IDeptClientService deptService;
	
	@GetMapping("/consum/dept/get")
	public Object getDept(long id) {
		return this.deptService.get(id);
	}
	@GetMapping("/consum/dept/list")
	public Object listDept() {
		return this.deptService.list();
	}
	@GetMapping("/consum/dept/add")
	public Object addDept(Dept dept) {
		return this.deptService.add(dept);
	}
  
  
}
