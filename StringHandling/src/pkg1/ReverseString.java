package pkg1;

public class ReverseString 
{
	 public static void main (String[] args) 
	 {
		 String s1="my name is satyam";
		 String s2=new StringBuilder(s1).reverse().toString();
		 
		System.out.println(s2);
		
	 }
}
