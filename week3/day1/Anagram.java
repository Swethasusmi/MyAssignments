package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()) {
			System.out.println("length of the strings are same");
		}
		char[] charArray1 = text1.toCharArray(); 
		System.out.println(Arrays.toString(charArray1));
		char[] charArray2 = text2.toCharArray(); 
		System.out.println(Arrays.toString(charArray2));
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		int count =0;
		for (int i = 0; i < charArray1.length; i++) {
			if (charArray1[i] == charArray2[i]) {
				count++;
			}
		}
		if (count == charArray2.length) {
			System.out.println("Both the arrays has same value");
		} 
		else {
			System.out.println("Both the arrays has not same value");
		}
	}
}