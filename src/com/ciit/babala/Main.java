package com.ciit.babala;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		 String input1 = "";
		 char letter = ' ';
		 String input2 = "";
		 String username = "";
	 	 String password = "";
		 double deposit = 0;
	 	 double withdrawal = 0;
		 double balance = 0;
		
		 do {
		
			System.out.println("Hi welcome to Mr. Senny's ATM Machine!"); 
			System.out.println ("Please select an option from the menu below: ");
			System.out.println ("l > login ");
			System.out.println ("c > create new account ");
			System.out.println ("q > quit ");
		    letter = reader.readLine().charAt(0);
		
		   switch (letter){
			case 'l':
				System.out.println  ("Please enter your user name: ");
				input1 = reader.readLine();
				System.out.println  ("Please enter your password: ");
				input2 = reader.readLine();
			 if (new String(username).equals(input1)&& new String(password).equals(input2)){
				 System.out.println ("Access Granted! ");
				do {
					System.out.println  ("d > deposit money ");
					System.out.println  ("w > withdraw money ");
					System.out.println  ("r > request balance ");
					letter = reader.readLine().charAt(0);
		    
			 switch (letter){
				case 'd':
					System.out.println  ("amount of deposit: $");
			    deposit = Double.parseDouble(reader.readLine());
				balance = balance + deposit; 
				
			 break;	 
			 case 'w':
				 System.out.println  ("amount of withdrawal: $");
				 withdrawal = Double.parseDouble(reader.readLine());
				if (withdrawal > balance){
					
					System.out.println  ("Not enough balance! ");	
				}
				else {
					balance = balance - withdrawal;
					
				}
			 break;	
			 case 'r':
				 System.out.println  ("your balance is: $");
				 System.out.println  (balance);
			 break;
			 case 'q':
			 break;	
		
		  	} 
			
				
			
			           
		            
				} while (letter != 'q');
			} 
			 else {
				 System.out.println  ("Log in failed! "); 
			}
			 break;
			 case 'c':
				 System.out.println  ("Please enter your user name: ");
				 username = reader.readLine();
				 System.out.println ("Please enter your password: ");
				 password = reader.readLine();
				 System.out.println  ("Your account has been created! ");
			 break;	
			 case 'q':
			 break;
			
		}
		
		  
		
		
	    }   while (letter != 'q');
		 System.out.println  ("Thanks for stopping by! ");
		
		
		

	}

}
