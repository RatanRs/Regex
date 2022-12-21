package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * 
 * @author Admin
 *
 */
public class Regex {
	/***
	 * 
	 * @param args
	 */
	void displayPassword() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the password");
		String passWord=input.next();
		String stringPattern = "[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern.matcher(passWord);
		if (matcher.matches()) {
			System.out.println("Password is  Validate");
		} else {
			System.out.println("Password is Not  Validate");
		}
	}

	public static void main(String[] args) {
		Regex display = new Regex();
		display.displayPassword();
	}
}