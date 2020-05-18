package com.java.arrays;

import java.util.function.Function;

public class ReverseString {
	public String reverse(String input) {
		String reversedString="";
//		if (s!=null) {
//			char[] revStrArray = new char[s.length()];
//			char[] strArray = s.toCharArray();
//			for (int i = strArray.length -1, j=0; i >= 0; i--,j++) {
//				revStrArray[j] = strArray[i];
//			}
//			reversedString = String.valueOf(revStrArray);
//		}
		
		if(input != null) {
			for (int i = input.length() -1; i >= 0; i--) {
				reversedString += input.charAt(i);
			}
		}
		return reversedString;	
	}

	public static void main(String[] args) {
		System.out.println(new ReverseString().reverse("OhMyGod"));
		
		//Java 1.8 approach 
		Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
		System.out.println(reverse.apply("OhMyGod"));
	}
}
