package com.jzp;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDubboConfiguration
@ComponentScan(value = {"com.jzp", "com.crossoverjie.distributed.intercept"})
public class SsmSecondsKillWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmSecondsKillWebApplication.class, args);
	}
}
