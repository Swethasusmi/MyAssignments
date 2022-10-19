package week3.day1;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1 java";
		int count=0;
		String[] s = text.split(" ");
		System.out.println(Arrays.toString(s));
		String replace = null;
		String a = " ";
		for(int i=0; i<s.length; i++) 
		{
			for(int j=i+1; j<s.length; j++) 
			{
				if(s[i].equals(s[j]))
				{
					count++;
					a=s[j];
				 }	
			}
		}
		if(count>1) 
		{
		replace = text.replace(a," ");
		}
		System.out.println(replace);
	}
}