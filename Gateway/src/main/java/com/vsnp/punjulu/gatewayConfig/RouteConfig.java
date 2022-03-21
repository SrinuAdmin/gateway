package com.vsnp.punjulu.gatewayConfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

	@Bean
	public RouteLocator route(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("customerId", r -> r.path("/customer/**").uri("lb://CUSTOMER-SEVICE"))
				.route("punjuluId", r -> r.path("/punjulu/**").uri("lb://JATHI-PUNJULU"))

				.build();
	}
}
