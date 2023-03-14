package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredServiceImpl;

public class EmailDriver {

	public static void main(String[] args) {

              Scanner sc=new Scanner(System.in);
              System.out.println("Enter First Name: ");
              String fname=sc.next();
              System.out.println("Enter Last Name: ");
              String lname=sc.next();
     
              Employee e1=new Employee(fname,lname);
              CredServiceImpl cs=new CredServiceImpl();
     
              System.out.println("Choose the number corresponding to the appropriate department listed below: ");
              System.out.println("1. Technical");
              System.out.println("2. Admin");
              System.out.println("3. HR");
              System.out.println("4. Legal");
              System.out.println("Enter choice:");
              int choice =sc.nextInt();
     
              String genemail="";
              String genpass="";
     
              switch(choice)
              {
                case 1:
    	           genemail=cs.generateEmailId(e1,"tech");
    	           break;
                case 2:
    	           genemail=cs.generateEmailId(e1, "admin");
    	           break;
                case 3:
    	           genemail=cs.generateEmailId(e1, "hr");
    	           break;
                case 4:
    	           genemail=cs.generateEmailId(e1, "legal");
    	           break;
                default:
    	           System.out.println("Please enter the valid choice!");		 
               }
		
              if(choice>0 && choice<5)
	        {
                  genpass=cs.generatePassword();
                  e1.setEmail(genemail);
                  e1.setPassword(genpass);
                  cs.showDetails(e1);
	        }
     
	}

}
