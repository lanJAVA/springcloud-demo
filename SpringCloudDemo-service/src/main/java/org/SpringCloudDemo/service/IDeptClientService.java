package org.SpringCloudDemo.service;

import java.util.List;

import org.SpringCloudDemo.vo.Dept;
import org.commons.config.FeignClientConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value="Dept-Service",configuration=FeignClientConfig.class)
public interface IDeptClientService {
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") long id);
	
	@GetMapping("/dept/list")
	public List<Dept> list();
	
	@PostMapping("/dept/add")
	public boolean add(Dept dept);
}
