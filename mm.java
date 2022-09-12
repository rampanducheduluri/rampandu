package kk;

class encapsulation {
	
	private String username;
	private String pass;
	public void setusername(String username)
	{   this.username =username;
	}
	public String getusername()
	{    if(username.equals("ram"))
	return "valid username";
	else
		return "invalid username";
	}
	
public void setpass(String pass)
{ 
	  this.pass=pass;
}
public String getpass()
{  
	{if(pass.equals("k@123"))
	{return "validpassword";}

else
	return "invalidpassword";

}}}


