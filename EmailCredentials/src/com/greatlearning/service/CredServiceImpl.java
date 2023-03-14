package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredServiceImpl implements CredService {

	@Override
	public String generateEmailId(Employee e1, String dept) {
		String myemail=e1.getFirstname().toLowerCase()+e1.getLastname().toLowerCase()+"@"+dept+".gl.com";
		return myemail;
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		
		String combined=caps+small+nums+splchars;
		
		String mypass="";
		Random random=new Random();
		for(int i=0;i<10;i++)
		{
			mypass=mypass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return mypass;
	}

	@Override
	public void showDetails(Employee e1) {
		System.out.println("Dear "+e1.getFirstname()+" your generated credentials are as follows:");
		System.out.println("Email Id --> "+e1.getEmail());
		System.out.println("Password --> "+e1.getPassword());
	}

}
