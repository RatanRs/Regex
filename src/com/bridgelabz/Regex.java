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
	void displayPhoneNumber() {
		String phoneNumber = "91 8806564783";
		String stringPattern="[0-9]{2} [0-9]{10}";
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern .matcher(phoneNumber);
		if (matcher.matches()) {
			System.out.println("PhoneNumber is  Validate");
		} else {
			System.out.println("PhoneNumber is Not  Validate");
		}
	}

	public static void main(String[] args) {
		Regex display = new Regex();
		display.displayPhoneNumber();
	}
}