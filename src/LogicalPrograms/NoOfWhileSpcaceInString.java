package LogicalPrograms;

public class NoOfWhileSpcaceInString {

	public static void main(String[] args) {
		String a=" P U N E";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
		char myChar = a.charAt(i);
		if(myChar==' ')
		{
		count++;
		}
		}
		System.out.println(("Number of white space in "+a+" is "+count));
	}

}
