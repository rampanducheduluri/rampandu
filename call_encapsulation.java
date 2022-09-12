package kk;
import java.util.*;
public class call_encapsulation {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
	
		encapsulation e = new encapsulation();
		System.out.println("enter username");
		e.setusername(s.next());
		System.out.println(e.getusername());
		
		System.out.println("enter password");
		  e.setpass(s.next());
         System.out.println(e.getpass());
	
	}}
