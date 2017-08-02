/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.service.impl;

import java.util.List;

import org.SpringCloudDemo.dao.IDeptDAO;
import org.SpringCloudDemo.service.IDeptService;
import org.SpringCloudDemo.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DeptServiceImpl implements IDeptService {
  @Autowired
  private IDeptDAO deptDAO ;
  @Override
  public Dept get(long id) {
    return this.deptDAO.findById(id);
  }

  @Override
  public List<Dept> list() {
    return this.deptDAO.findAll();
  }

  @Override
  public boolean add(Dept dept) {
    return this.deptDAO.doCreate(dept);
  }

}
