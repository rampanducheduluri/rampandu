package kk;

 class Array {
	 
	 public static void sumavg(int a[])
	 {  int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
			 
		 }
		 int avg=sum/a.length;
		 
		 System.out.println("sum of array"+sum);
		 
		 System.out.println("avg of array"+avg);
	 }
 }



