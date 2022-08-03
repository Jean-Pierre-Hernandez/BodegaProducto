package com.idat.BodegaProducto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class BodegaProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BodegaProductoApplication.class, args);
	}

}
