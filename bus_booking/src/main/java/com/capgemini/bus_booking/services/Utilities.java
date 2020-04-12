package com.capgemini.bus_booking.services;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Utilities {




	public static boolean emailValidator(String email) {                                 //*********************email validation****************************
		if (email != "" && email != null) {
			final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
					Pattern.CASE_INSENSITIVE);
			Matcher matcher = EMAIL_REGEX.matcher(email);
			return matcher.find();
		} else {

			System.out.println("Email id is mandatory");
			return false;
		}
	}
		public static boolean nameValidator(String name) {                              //*********************name validation****************************
		if(name!="" && name != null) {
			Pattern p =Pattern.compile("[A-Z]{0}[a-z]{1-10}");
			Matcher m =p.matcher(name);
			return m.find();
			
		}
		else {
			System.out.println("Enter ur  name");
			return false;
			}
		}
		public static boolean contact_noValidator(String contact_no) {                //*********************contact validation****************************
			if (contact_no !="" && contact_no!= null) {
				Pattern p = Pattern.compile("[789]{1}[0-9]{1-9}");
				Matcher m = p.matcher(contact_no);
				return m.find();
			}
			else {
				System.out.println("Contact no is mandatory");
				return false;
			}
	}
		public static boolean passwordValidator(String password) {                  //*********************password validation****************************
			if (password !="" && password!= null) {
				Pattern p = Pattern.compile("\"((?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})\";\r\n" + "");
				Matcher m = p.matcher(password);
				return m.find();
			}
			else {
				System.out.println("Enter a strong password");
				return false;
			}
	}
		
}