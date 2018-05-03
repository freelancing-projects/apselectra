package org.apselectra.com.apselectra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@ComponentScan("org.apselectra.com.*")
public class ApselectraApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApselectraApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApselectraApplication.class, args);
	}

}