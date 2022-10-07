package week1.day2;

public class Palindrom {

	public static void main(String[] args) {
		int r,temp,sum=0;
		int num=34343;
		temp=num;
		String str2 = Integer.toString(num);
		int length=str2.length();

	      for(int i=0;i<=length-1;i++)  
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
			if (temp==sum) {
				System.out.println("it is palindrome");
			}
			else {
				System.out.println("it is not palindrome");
			}
	}

}
