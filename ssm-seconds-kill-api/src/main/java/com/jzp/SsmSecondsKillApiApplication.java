package com.jzp;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.jzp.*")
//@DubboComponentScan("com.jzp.api.service.impl")
@EnableDubboConfiguration
public class SsmSecondsKillApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmSecondsKillApiApplication.class, args);
	}
}
