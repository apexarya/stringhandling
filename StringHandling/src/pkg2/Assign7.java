package pkg2;

import java.util.Scanner;

public class Assign7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		String s=sc.nextLine();
		String rs="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rs=rs+s.charAt(i);
		}
		if(s.equals(rs))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
