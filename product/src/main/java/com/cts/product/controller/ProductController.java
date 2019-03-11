package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@RequestMapping(value="addProduct.html",method=RequestMethod.GET)
	public String getAddProductPage(){
		return "addProduct";
	}
	
	@RequestMapping(value="updateProduct.html",method=RequestMethod.GET)
	public String getUpdateProductPage(){
		return "updateProduct";
	}
	
	@RequestMapping(value="deleteProduct.html",method=RequestMethod.GET)
	public String getDeleteProductPage(){
		return "deleteProduct";
	}
	
}
