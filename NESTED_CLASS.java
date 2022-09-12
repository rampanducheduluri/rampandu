package kk;

public class NESTED_CLASS {

	static String s = "raju";
	static String j = "krishna";

	public static class demo {

		String k = "kalyan";

		public void call() {
			System.out.println(s + "\n" + j + "\n" + k);
		}

		public static class nuro extends demo {

		public void run() {
			System.out.println(s + " " + j + " " + k);
		}
		}
		public static class rrr extends nuro {
			public void cry() {
				System.out.println(s + " " + j + " " + k);
			}
	}
	}

	public static void main(String args[]) {
	NESTED_CLASS.demo.nuro.rrr a = new NESTED_CLASS.demo.nuro.rrr();		
	 demo.nuro b = new demo.nuro();

      	b.call();
		b.run();
	    a.call();		
	    a.run();
	    a.cry();

		

	}

}
