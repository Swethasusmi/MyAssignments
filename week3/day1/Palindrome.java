package week3.day1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam";
		String rev="";
		char[] charArray = input.toCharArray(); 
		System.out.println(Arrays.toString(charArray));
		
		for(int i=input.length()-1;i>=0;i--) {
			rev = rev + charArray[i];
		}
		System.out.println(rev);
		if(input.equalsIgnoreCase(rev)) {
			System.out.println("It is a palindrome");
		}
	}
}