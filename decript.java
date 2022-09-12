package kk;

public class decript {

	public static void main(String[] args) {
		
		String s = "apple is good for health";
		String c[]=s.split(" ");
		char ch[]=s.toCharArray();
		String encript="";
		for(int j=0;j<c.length;j++)
		{
		for(int i=0;i<c.length;i++)
		{
			if(ch[i]!=' ')
			{
			encript=encript+((++ch[i]));
			}
			else if(ch[i]==' ')
			{
				encript=encript+' ';
			}
		}
		
		}
		System.out.print(encript);
		
	}}
