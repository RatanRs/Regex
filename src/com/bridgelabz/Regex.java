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
	void displayemailId() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Email_Id=");
		String emailId = input.next();
		String stringPattern= "abc.[a-z]{3,}+[@]bl.co.[a-z]{2}";
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern .matcher(emailId);
		if (matcher.matches()) {
			System.out.println("EmailId is  Validate");
		} else {
			System.out.println("EmailId is Not  Validate");
		}
	}

	public static void main(String[] args) {
		Regex display = new Regex();
		display.displayemailId();
	}
}