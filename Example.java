package kk;

public class Example {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6};
		try
		{
			for(int i=0;i<=a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("Array out of bound");
		}      
		
		finally
		{
			System.out.println("main method end");
		}
		 
	} 

}
