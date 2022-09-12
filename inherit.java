package kk;


class java{
	public void overridding()
	
	{
		System.out.println("father");
	}
}

class python extends java
{
	public void overloading()
	{
		System.out.println("child");
	}
}
public class inherit {
	public static void main(String args[])
	{
		java p = new python();
		p.overridding();
		
		python s = (python)p;
		s.overridding();
		s.overloading();
	}

}
