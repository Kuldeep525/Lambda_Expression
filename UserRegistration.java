package com.blz.program;
import java.util.Scanner;
import java.util.regex.Pattern;

interface UserRegistrationFirstName {
	 
	 boolean firstName();
}

interface UserRegistrationLastName {
	 
	 boolean lastName();
}

interface UserRegistrationEmail {
	 
	 boolean email();
}

interface UserRegistrationPhoneNumber {
	 
	 boolean number();
}

interface UserRegistrationPassword {
	 
	 boolean password();
}

public class UserRegistration {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		UserRegistration user = new UserRegistration();
		
		 UserRegistrationFirstName enterFirstName = () -> {
			 System.out.println("Enter your valid first name ");
			 String name = sc.next();
			 return user.firstName(name);
		 };
		 enterFirstName.firstName();
			 
			 
		 UserRegistrationLastName enterLastName = () -> {
			 System.out.println("Enter your valid Last name ");
			 String lastName = sc.next();
			 return user.lastName(lastName);
		 };
		 enterLastName.lastName();
		 
		 UserRegistrationEmail enterEmail = () -> {
			 System.out.println(" Enter your valid Email");
			 String email = sc.next();
			 return user.emailId(email); 
		 };
		 enterEmail.email();
			 
		 UserRegistrationPhoneNumber enterMobileNumber = () -> {
				System.out.println("Enter your valid  mobile number ");
				String number = sc.next();
				return user.mobileNumber(number);
		 };
		 enterMobileNumber.number();
		  
		 UserRegistrationPassword enterPassword = () -> {
			 System.out.println("Enter your valid  password ");
			 String password = sc.next();
			 return user.password(password);	
		 };
		 enterPassword.password();
	}
	
	public boolean firstName(String name) {
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{2,}", name);
		try {
		if(correct) {
			System.out.println("First name inserted successfully");
			
		}else {
			throw new UserException("Please enter valid last name");
		}
		}catch(UserException e ) {
			System.out.println(e.getMessage());
	}
		return correct;	
	}
	
	
	public boolean lastName(String name) {
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{2,}", name);
		try {
		if(correct) {
			System.out.println("Last name inserted successfully");
			
		}else {
			throw new UserException("Pls enter correct last name");
		}
		}catch(UserException e ) {
			System.out.println(e.getMessage());
		}
		return correct;	
		
	}
	
	public boolean emailId(String email) {
	
		boolean  correct = Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email);
		try {
		if(correct) {
			System.out.println("Email inserted successfully");
			
		}else {
			throw new UserException("Pls  enter valid email ");
		}
		}catch(UserException e) {
			System.out.println(e.getMessage());
		}
		return correct;	
		
	}
	public boolean mobileNumber(String number) {
		
		boolean  correct = Pattern.matches("[987]{1}\\d{9}", number);
		try {
		if(correct) {
			System.out.println("Mobile Number  inserted successfully");
			
		}else {
			throw new UserException("Pls  enter valid number");
		}
		}catch(UserException e) {
			System.out.println(e.getMessage());
		}
		return correct;	
		
		
	}
	
	public boolean password(String password) {     // with one special character
		
		boolean  correct = Pattern.matches("[A-Z][a-z]{6}[0-9]+[@#]{1}", password);
		try {
		if(correct) {
			System.out.println("password  inserted successfully");
			
		}else {
			throw new UserException(" Invalid password");
		}
		}catch(UserException e) {
			System.out.println(e.getMessage());
		}
		return correct;		
	}
}




