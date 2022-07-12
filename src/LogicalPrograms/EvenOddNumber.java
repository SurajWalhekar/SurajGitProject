package LogicalPrograms;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		//num/2 rem -->0-->even
		
		System.out.println(10%2);//0
		System.out.println(10/2);//5
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int a=sc.nextInt();
		if(a%2==0) 
		{
	     System.out.println("Given Number Is Even number");
		}
		else
		{
			System.out.println("Given Number Is Odd number");
		}

	}

}
