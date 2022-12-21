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
	void displayLastName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Last_Name=");
		String firstName = input.next();
		String y = "[A-Z]{1}[a-z]{2}";
		Pattern p = Pattern.compile(y);
		Matcher m = p.matcher(firstName);
		if (m.matches()) {
			System.out.println("Last Name Validate");
		} else {
			System.out.println("Last Name Not  Validate");
		}
	}

	public static void main(String[] args) {
		Regex display = new Regex();
		display.displayLastName();
	}
}