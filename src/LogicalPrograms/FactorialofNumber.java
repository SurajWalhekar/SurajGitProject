package LogicalPrograms;

public class FactorialofNumber {
	public static void main(String[] args) {
		//4!-->4*3*2*1=24
		
		int num=6;
		int num1=1;
		
		for(int i=num;i>=1;i--) //6,5,4,3,2,1
		{
			num1=num1*i;////6*1=6;6*5=30:30*4=120;120*3=360;360*2=720;
		}
		System.out.println("factorial of number is"+num1);
				
	}

}
