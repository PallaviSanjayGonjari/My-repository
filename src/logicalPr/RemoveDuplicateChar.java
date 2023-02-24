package logicalPr;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String st=sc.next();
	char ch[]=st.toCharArray();
	int len=ch.length-1;
	st="";
	for(int i=0;i<=len;i++)
	{
		st=st+ch[i];
		
	}
		

	}

}
