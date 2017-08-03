/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.test;

import static org.junit.Assert.*;

import org.SpringCloudDemo.StartDept8001;
import org.SpringCloudDemo.service.IDeptService;
import org.SpringCloudDemo.vo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@SpringBootTest(classes=StartDept8001.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class IDeptServiceTest {
  @Autowired
  private IDeptService deptService;
  @Test
  public void testGet() {
    System.out.println(this.deptService.get(1L));
  }
  @Test
  public void testList() {
    System.out.println(this.deptService.list());
  }
  @Test
  public void testAdd() {
    Dept dept = new Dept();
    dept.setDname("Test001");
    System.out.println(this.deptService.add(dept));
  }
}
