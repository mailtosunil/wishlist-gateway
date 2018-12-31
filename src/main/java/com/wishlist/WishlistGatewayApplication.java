package com.wishlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class WishlistGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishlistGatewayApplication.class, args);
	}
	
}

