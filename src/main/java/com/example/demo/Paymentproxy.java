package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.demo.Model.Payment;

@FeignClient(name ="payments",url ="${name.service.url}")
public interface Paymentproxy {

	@PostMapping("/payment")
	Payment createPayment(@RequestHeader String requestId, @RequestBody Payment payment);
		
}
