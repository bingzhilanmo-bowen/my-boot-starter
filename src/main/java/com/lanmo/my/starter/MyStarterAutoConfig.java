package com.lanmo.my.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MyStartService.class)
@EnableConfigurationProperties(MyStartProperties.class)
public class MyStarterAutoConfig {

	@Autowired
	private MyStartProperties properties;


	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnProperty(prefix = "my.starter", value = "enabled", havingValue = "true")
	MyStartService myStartService(){

		return new MyStartService(properties.getName(), properties.getAge());

	}

}
