package com.eurekka.api.gateway.apigateway.globalfilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;


import reactor.core.publisher.Mono;

@Component
public class LoggingFilter implements GlobalFilter{
	
	
	private Logger logg=LoggerFactory.getLogger("LoggingFilter");

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logg.info("path of request received is ="+exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
