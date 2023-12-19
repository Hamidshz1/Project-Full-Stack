package com.hamid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication//(scanBasePackages = {"resource", "Service", "Service.Impl", "utility"})
//@EntityScan(basePackages = {"com.hamid.model"})
//@EnableJpaRepositories(basePackages = {"repo"})
//@ComponentScan(basePackages = {"resource", "Service", "Service.Impl", "repo", "utility"})
public class HamidApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(HamidApplication.class, args);
	}

}
