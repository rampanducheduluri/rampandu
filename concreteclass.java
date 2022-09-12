package kk;
import java.util.Scanner;

public class concreteclass {
	
	
	public static int product(int a,int b)
	{
		return a*b;
	}

	public static void main(String args[])
	{
		int c=1;
		do {
		
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter a value");
		int a = s.nextInt();
		System.out.println("enter b value");
		int b = s.nextInt();
		product(a,b);
		System.out.println(product(a,b));
		System.out.println("enter 1 to continue");
		
		c =s.nextInt();
	
	
		}
		
		while(c==1);
	}
}

