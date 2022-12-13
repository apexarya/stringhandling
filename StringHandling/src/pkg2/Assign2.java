package pkg2;

public class Assign2 
{
	public static void main(String[] args)
	{

		String s="my name is deepak";  ///--kapeed si eman ym
		String rvs = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rvs=rvs+s.charAt(i);
		}
		System.out.println(rvs);
	}

}
