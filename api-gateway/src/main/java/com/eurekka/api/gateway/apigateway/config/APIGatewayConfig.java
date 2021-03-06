package com.eurekka.api.gateway.apigateway.config;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//Created for custom routing

@Configuration
public class APIGatewayConfig {
	
	
	//To customize the route
	@Bean
	public RouteLocator gateWayRouter(RouteLocatorBuilder builder) {
		Function<PredicateSpec, Buildable<Route>> fun =p->p.path("/get").
				filters(f->f.addRequestHeader("MyHeader", "MyURI")).
				uri("http://httpbin.org:80");
		
		return builder.routes().route(fun).build();
	}

	
	//@CircuitBreakre(name="")
	public RouteLocator gateWayCircuitRouter(RouteLocatorBuilder builder) {
		Function<PredicateSpec, Buildable<Route>> fun =p->p.path("/get").
				filters(f->f.addRequestHeader("MyHeader", "MyURI")).
				uri("http://httpbin.org:80");
		
		return builder.routes().route(fun).build();
	}
}
