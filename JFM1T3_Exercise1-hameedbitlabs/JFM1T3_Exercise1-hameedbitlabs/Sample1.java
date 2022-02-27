// Complete and execute java Program for Narrow/Explicit Type-casting

import java.util.Scanner;
class Sample1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter marks");
		int marks=s.nextInt();
		
		System.out.println("enter total marks");
		float totalmarks=s.nextFloat();
		
		float per=(marks/totalmarks)*100;
		System.out.println("Percentage of marks in CS = "+ per);
		int newper=(int)per;
		System.out.println("Percentage of marks in CS = "+ newper);
	}

}
