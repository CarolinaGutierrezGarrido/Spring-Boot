package com.nttdata.bootcamp.configcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class testController {
	@Value("${product.product-name}")
	private String myProduct;

 

	@GetMapping(path = "/getProduct")
	public String myProduct() {
		return this.myProduct;

 

	}

}
