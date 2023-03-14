package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface CredService {
	
	String generateEmailId(Employee e1,String dept);
	String generatePassword();
	void showDetails(Employee e1); 

}
