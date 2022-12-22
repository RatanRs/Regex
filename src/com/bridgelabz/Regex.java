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
	void displayEmailId() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the EmailId");
		String passWord=input.next();
		String stringPattern = "[a-z]{3,}[-.+]{0,1}[10]{0,3}[@]{1}[10]{0,3}[a-z]{0,5}[.]{0,1}[a-z]{0,3}[,.]{0,1}[a-z]{0,3}\")";
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern.matcher(passWord);
		if (matcher.matches()) {
			System.out.println("Email ID is  Validate");
		} else {
			System.out.println("Email ID is Not  Validate");
		}
	}

	public static void main(String[] args) {
		Regex display = new Regex();
		display.displayEmailId();
	}
}