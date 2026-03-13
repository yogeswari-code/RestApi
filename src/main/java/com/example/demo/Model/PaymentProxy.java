package com.example.demo.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class PaymentProxy {

	private final WebClient wc;
	
	@Value("${name.service.url}")

	private String url;

	public PaymentProxy(WebClient wc) {
		
		this.wc = wc;
	}
	
	public Mono<Payment> createPayment(String requestId, Payment payment){

		return wc.post().uri(url +"/payment").header("requestId", requestId).body(Mono.just(payment),Payment.class).retrieve().bodyToMono(Payment.class);
	}
	
	
	
}
