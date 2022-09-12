package kk;
import java.util.*;

public class banking {
	
	long acc_no;
	String name;
	double balance;
	
	public void details(String name,long acc_no,double balance) 
	{
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
		System.out.println(acc_no);
		System.out.println(name);
		System.out.println(balance);
		
	}
	
	public void diposite(double credit)
	{
		balance=balance+credit;
		
		System.out.println(balance);
	}
	
	public void withdraw(double debit)
	{
		if(balance<debit)
		{
			System.out.println("insuffcient balance");
		}
		else
		{
			balance=balance-debit;
			
			System.out.println(balance);
		}
		
	}

	public static void main(String[] args) {
		
		
		int c=1;
		do {
	
		Scanner s = new Scanner(System.in);
		
		 banking b = new  banking();
		 
		 System.out.println("enter name of account holder");
		 
		 String n=s.next();
		 
		 System.out.println("enter account no");
		 
		 long acc = s.nextLong();
		 
		 System.out.println("enter current account balance");
		 
		 double bal = s.nextDouble();
		 
		 b.details(n,acc,bal);
		 
		 System.out.println("enter amount to deposite");
		 
		 double cre = s.nextDouble();
		 
		b.diposite(cre);
		
		System.out.println("enter amount to withdraw");
		
		double deb = s.nextDouble();
		
		   b.withdraw(deb);
		   
		   System.out.println("enter 1 to continue ");
		   
		   c= s.nextInt();
		}
		while(c==1);
		
		
		
	}

}
