/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {
  private Long deptno;
  private String dname;
  private String loc ;
  public Long getDeptno() {
    return deptno;
  }
  public void setDeptno(Long deptno) {
    this.deptno = deptno;
  }
  public String getDname() {
    return dname;
  }
  public void setDname(String dname) {
    this.dname = dname;
  }
  public String getLoc() {
    return loc;
  }
  public void setLoc(String loc) {
    this.loc = loc;
  }
  @Override
  public String toString() {
    return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
  }
  
}
