/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.service;

import java.util.List;

import org.SpringCloudDemo.vo.Dept;

public interface IDeptService {
  public Dept get(long id);
  
  public List<Dept> list();
  
  public boolean add(Dept dept);
}
