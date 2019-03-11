package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;  
	
	@Override
	public String validate(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
