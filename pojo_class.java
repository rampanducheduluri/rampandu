package kk;
import java.util.*;

public class pojo_class {
	
      
	 
	private double selling_price;
	public  void set(double selling_price)
	{
	
		this.selling_price=selling_price;
		}
	
	public double selling_price()
	{
		return selling_price;
	}
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		pojo_class p = new pojo_class();
		int c=1;
		do {
			System.out.println("enter  price ");
			double a =s.nextDouble();
			System.out.println("enter   selling price ");
			double b =s.nextDouble();
		     	p.set(b);
		     	System.out.println("selling price");
		        System.out.println(p.selling_price());
		        
		        double profit_loss=b-a;
		        
		        if( profit_loss>0)
		        { double profit = profit_loss;
		        System.out.println("profit earned"+profit);
		        
		        System.out.print("percentage of profit earned");
		        
		        double profit_per = (profit/a)*100;
		        
		        System.out.println(" "+profit_per);
		        }
		        
		        else if( profit_loss<0)
		        { double loss=b-a;
		        System.out.println("loss on product "+loss);
		        System.out.print("percentage of loss");
		        
		        double loss_per = (loss/a)*100;
		        System.out.println((" "+loss_per));
		        }
		        
		        else {
		        	System.out.println("no profit or loss");
		        }
		        
	         	System.out.println("enter 1 to continue");
		c=s.nextInt();
		}
		while(c==1);
		
		
		
		

	}

}
