package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	 static Pattern firstName = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	    static Pattern lastName = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	    static Pattern email = Pattern.compile("^[a-z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2,3})*$");
	    static Pattern mobileNumber = Pattern.compile("^(91)[ ]{1}[6-9]{1}[0-9]{9}$");
	    static Pattern password = Pattern.compile("^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%*]).{8,})$");
	   
	    
	    public static boolean firstName() throws MyCustomException {
	        Matcher firstNameTest = firstName.matcher("RatanR");

	        if (firstNameTest.matches() == true)
	            return true;
	        else
	            throw new MyCustomException(" first name is invalied");
	    }

	    public static boolean lastName() throws MyCustomException {
	        Matcher lastNameTest = lastName.matcher("SollapureT");
	        if (lastNameTest.matches() == true)
	            return true;
	        else
	            throw new MyCustomException(" last name is inValied");
	    }

	    public static boolean email() throws MyCustomException {
	        
	        Matcher emailTest = email.matcher("100abc.xy@gamil.com");
	        if (emailTest.matches() == true)
	            return true;
	        else
	            throw new MyCustomException(" emailId is Invalied");
	    }

	    public static boolean mobileNumber() throws MyCustomException {
	        Matcher mobileNumberTest = mobileNumber.matcher("91 565567885");
	        if (mobileNumberTest.matches() == true)
	            return true;
	        else
	            throw new MyCustomException(" mobileNumber is inValied");
	    }

	    public static boolean password() throws MyCustomException {
	        Matcher passwordTest = password.matcher("12abc@$");
	        if (passwordTest.matches() == true)
	            return true;
	        else
	            throw new MyCustomException(" Password is Invalid");
	    }
	    

	    public static void main(String[] args) throws MyCustomException {
	        try {
	            UserRegistration.firstName();
	        } catch (MyCustomException firstName) {
	            System.out.println("Exception - " + firstName);
	        }
	        try {
	            UserRegistration.lastName();

	        } catch (MyCustomException lastName) {
	            System.out.println("Exception - " + lastName);
	        }
	        try {
	            UserRegistration.email();
	        } catch (MyCustomException emaild) {
	            System.out.println("Exception - " + emaild);
	        }
	        try {
	            UserRegistration.mobileNumber();
	        } catch (MyCustomException mobileNumBer) {
	            System.out.println("Exception - " + mobileNumBer);
	        }
	        try {
	            UserRegistration.password();
	        } catch (MyCustomException password) {
	            System.out.println("Exception - " + password);
	        }

	    }
	  
}

