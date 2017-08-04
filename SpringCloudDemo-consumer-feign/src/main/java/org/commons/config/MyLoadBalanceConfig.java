package org.commons.config;

import org.springframework.context.annotation.Bean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

public class MyLoadBalanceConfig {

	@Bean
	public IRule ribbonRule() {
		return new RandomRule();
	}
}
