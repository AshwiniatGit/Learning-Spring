package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductService productService;
	
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
