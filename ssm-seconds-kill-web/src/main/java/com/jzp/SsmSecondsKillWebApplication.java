package com.jzp;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@DubboComponentScan(basePackages = "com.jzp.controller")
@EnableDubboConfiguration
public class SsmSecondsKillWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmSecondsKillWebApplication.class, args);
	}
}
