package kk;
import java.util.*;

public class call_Array {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		
	      int size = s.nextInt();
	      
	      int a[] =new int [size];
	      
	      System.out.println("Enter Array values");
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  
	    	  a[i]=s.nextInt();
	      }
	
	    Array.sumavg(a);
	    
	    
	    s.close();


	}


}
