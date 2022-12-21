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
	void displayFirstName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First_Name=");
		String firstName = input.next();
		String y = "[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(y);
		Matcher m = p.matcher(firstName);
		if (m.matches()) {
			System.out.println("First Name Validate");
		} else {
			System.out.println("First Name Not  Validate");
		}
	}

	public static void main(String[] args) {
		Regex display = new Regex();
		display.displayFirstName();
	}
}