package pkg1;

public class Sentence 
{
	public static void main(String[] args) 
	{
		String s="my name is satyam";
		String[] s1=s.split(" ");
		int L=s1.length;
		for(int i=0;i<L;i=i+1)
		{
			System.out.println(s1[i]);
		}
		
		
	}

}
