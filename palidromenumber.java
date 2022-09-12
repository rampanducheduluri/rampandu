package kk;

public class palidromenumber {
	
	public static void main(String args[])
	{
		int rem=0,rev=0;
		for(int i=10;i<=1000;i++)
		{
			int n=i;
			while(n>0)
			{
				rem=n%10;
				n=n/10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
				System.out.println(i+"number is palindrome");
			rev=0;
		}
	}

}
