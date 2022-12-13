package pkg2;

import java.util.Scanner;

public class Assign6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string in 0&1");
		String num=sc.nextLine(),st1="",st2="";
		
		for(int i=0;i<num.length();i++)
		{
			if(num.charAt(i)=='1')
			{
				st1=st1+num.charAt(i);
			}
			else
			{
				st2=st2+num.charAt(i);
			}
		}
		System.out.println((st1+st2));
	}

}
