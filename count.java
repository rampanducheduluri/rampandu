package kk;

public class count {

	
		public static void main(String[] args) { 
		 String str="good morning"; 
		// String s=str.toUpperCase();
		 char[] s1=str.toCharArray();
		 for(char ch='a';ch<='z';ch++) 
		 { 
		 int count1=0; 
		 for(int i=0;i<s1.length;i++) 
		 { 
		 if(ch==s1[i]) 
		 { 
		 count1++; 
		 }} 
		 if(count1>0) 
		 System.out.println(ch+" = "+count1);}}}