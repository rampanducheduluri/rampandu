package kk;

abstract public class maths {
	int a=10;
	int b= 20;
	abstract public void run();
}
 class maths1 extends maths
{
	public void run()
	{
		int d= a+b;
		System.out.println(d);
		
}
	

	public static void main(String[] args) {
		maths j = new maths1();
		j.run();
		
	}

}
