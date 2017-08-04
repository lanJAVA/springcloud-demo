/*
 * Copyright 2017 - 数多科技
 * 
 * 北京数多信息科技有限公司
 * 本公司保留所有下述内容的权利。
 * 本内容为保密信息，仅限本公司内部使用。
 * 非经本公司书面许可，任何人不得外泄或用于其他目的。
 */
package org.SpringCloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="ribbonClient",configuration=MyLoadBalanceConfig.class)
@EnableFeignClients(basePackages="org.SpringCloudDemo.servcie")
public class StartConsumer80 {

  public static void main(String[] args) {
    SpringApplication.run(StartConsumer80.class, args);
  }

}
