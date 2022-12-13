package pkg2;

import java.util.Scanner;

public class Assign1
{
	public static void main(String[] args) 
	{

		String s="my name is deepak"; //- deepak is name my
		String rs="";
		String[] str1=s.split(" ");
		int len=str1.length;
		
		for(int i=len-1; i>=0;i=i-1)
		{
			rs=rs+" "+str1[i];
			
		}
		System.out.println(rs);
	
		
	
	}
}
	
