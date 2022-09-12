package kk;

public class palindrome {

	public static void main(String[] args) {
	
		int rem=0,rev=0;
		for(int i=0;i<=1000;i++)
		{
			int n=i;
			while(n>0)
			{
				rem=n%10;
				n=n/10;
				rev=(rev*10)+rem;
			
			if(i==rev)
			System.out.println(i+"is a palindrome");
			
			}
	
	  rev=0;

}}}