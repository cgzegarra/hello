package com.bptn;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a = 'A';
		
		// Form 1: We assign the literal directly
		//String str1 = "Hello World";
		
		// Form 2: We allocate memory for the String using new keyword (standard)
		//String str2 = new String("Hello World");
		
		// 1%
		String str1 = new String("Hello");
		StringBuilder strBuilder = new StringBuilder("Hello");
		
		//strBuilder = "";
			
		/*
		if (str1==str2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}*/

		// 99%
		String str3 = new String("Hello");
		String str4 = "Bptn";
		
		//str3 = "Hello1";
		
//		if (str3==str4) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("Not Equal");
//		}
		
		// join strings or concatenate
		String str5 = str3 + " " + str4 + " 2023"; // 99%
		
		String str6 = str3.concat(str4)
				         .concat("2023 2024 2025 2026")
				         .concat(" ")
				         .concat("Hello");
		
		
		String str7 = String.format("Hello my name is %d, I live in %s",30,"Ontario");
		
				; // More Object Oriented Way
		
		//System.out.println(str5);
		
		
		double c = 10.5;
		
		String str = "Hello" + " " + c;
		
		
		int[] a1 = {1,2,3};
		
		int size = a1.length;
		
		String str8 = "Hello Bptn";
//                     0123456789
		String str9 = "Bp";
		
		int len = str8.length();
		
		//System.out.println(str8.indexOf(str9));
		
		String str10 = "Bptn";
		String str11 = "BPTN";
		
		String str0 = "Hello \nBptn";
		//System.out.println(str0);
		
		if ( str10.equals(str11) ) {
			
		}
		
		// If Strings are Equal --> 0
		// If the String to the left is alphabetically bigger than the String to the right the result is Positive
		// If the String to the right is alphabetically bigger than the String to the left the result is Negative
		
		//" A < B < C"
		// 65 < 66 < 67
		
		//  Bptn
		//  Bpa
		
		
		//System.out.println( str10.compareTo(str11) );
		
		String str12 = "Hello BPTN";
		//              0123456789

		System.out.println(str12.substring(6));
		System.out.println(str12.substring(6,7));
		
		System.out.println(str12.charAt(6));
		
		//str12 = str12.substring(6);
		
		//System.out.println(str12);
		
		
	}

}
