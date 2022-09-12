package kk;

public class objecttype_2 {
	
	
	String b ="ram";

	public static void main(String[] args) {
		
		
		try {
	 	
	       	objecttype_2 o = objecttype_2.class.newInstance();
		      System.out.println(o.b);
		}
		catch(Exception e)
		{
			System.out.println("object wrong created");
		}
	}
    
}
