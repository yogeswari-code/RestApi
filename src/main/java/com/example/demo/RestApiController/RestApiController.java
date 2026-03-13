package com.example.demo.RestApiController;
import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Paymentproxy;
import com.example.demo.Model.Payment;
import com.example.demo.Model.PaymentProxy;

import reactor.core.publisher.Mono;



@RestController
public class RestApiController {

	//OpenFeign
//	private final Paymentproxy proxy;
//
//	public RestApiController(Paymentproxy proxy) {
//		
//		this.proxy = proxy;
//	} 
//	
//	@PostMapping("/payment")
//	
//	public Payment CreatePayment( @RequestBody Payment payment) {
//		
//		String requestId = UUID.randomUUID().toString();
//		
//		return proxy.createPayment(requestId, payment);
//	}
	
	//Resttemplate 
	
	private final PaymentProxy paymentproxy;

	public RestApiController(PaymentProxy paymentproxy) {
		
		this.paymentproxy = paymentproxy;
	}
	
	@PostMapping("/payment")
	
	public Mono<Payment> CreatePayment(@RequestBody Payment pay){
		
		String requestId = UUID.randomUUID().toString();
		
		return paymentproxy.createPayment(requestId, pay);
	}
	
	
}
