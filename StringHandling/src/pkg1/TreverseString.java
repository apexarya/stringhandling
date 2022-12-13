package pkg1;

public class TreverseString 
{
	public static void main(String[] args) 
	{
//		String a="deepak";
//		int l=a.length();
		
//		for(int i=0;i<l;i=i+1)
//		{
//			System.out.println(a.charAt(i));
//		}
//		System.out.println(a.charAt(3));
		
		String s="deepak";
		String rev="";
		for(int i=s.length()-1;i>=0;i=i-1)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
