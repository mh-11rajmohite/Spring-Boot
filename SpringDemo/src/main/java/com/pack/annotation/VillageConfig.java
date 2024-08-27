package com.pack.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VillageConfig {

	@Bean
	public Village villageBean() {
		return new Village();
		
		
	}
	
	
	@Bean
	public District districtBean() {
		
		return new District();
		
	}
}
