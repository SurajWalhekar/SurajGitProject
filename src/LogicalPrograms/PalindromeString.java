package LogicalPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of String");
		String a = sc.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
		b=b+a.charAt(i);
		}
		System.out.println("Original Sring is "+a);
		System.out.println("Reverse String is "+b);
		if(a.equals(b))
		{
		System.out.println("String is in Palindrome");
		}
		else {
		System.out.println("String is not in Palindrome");
		}


	}

}
