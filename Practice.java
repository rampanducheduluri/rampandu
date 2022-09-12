package kk;

import java.util.*;

interface user {
	abstract public void setun(String username1);

	abstract public void setpw(String password1);

	abstract public void setotp(long otp);

}

class signup extends Practice {
	public void fn() {
		System.out.println("enter first name");
		firstname = sc.next();
	}

	public void ln() {
		System.out.println("enter last name");
		lastname = sc.next();
	}

}

class un extends signup {
	public void setun() {

		username = firstname + lastname;

		System.out.println(username);

	}

}

class pwd extends signup {
	public void setpw() {
		password = sc.next();
		System.out.println(password);
	}
}

class set extends signup implements user {

	public void setun(String username1) {

		username1 = username;
	}

	public void setpw(String password1) {

		password1 = password;

	}

	public void setotp(long otp) {
		otp = sc.nextLong();

	}

}

class get extends Practice {
	public long getotp() {
		if (otp == 6836423)

			System.out.println("valid otp");

		else

			System.out.println("otp not matched");

		return 0;
	}

	public String getun() {
		if (username1.equals(username))
			return "validusername";
		else
			return "invalid username";
	}

}

public class Practice {
	protected String username1;
	private String password1;
	String firstname;
	String lastname;
	String username;
	long phoneno;
	String password;
	protected int otp;
	String username_2;
    int otp2 ;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		signup s = new signup();
		un u = new un();
		pwd p = new pwd();
		set s1 = new set();
		get g = new get();
		Practice p1 = new Practice();
		
	
		s.fn();
		s.ln();
		p.setpw();
	  s1.setotp(sc.nextLong());
	     g. getotp();
	     
	
		 
	}

}
