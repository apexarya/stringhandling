package pkg2;



public class Assign3 
{
	public static void main(String[] args) 
	{
		String s="my name is deepak"; //--ym eman si kapeed
		String[] s1=s.split(" ");
		
		  
		String rs1="";
		
		String rs2="";
		for(int i=s1.length-1;i>=0; i--)
		{
			rs1=rs1+" "+s1[i];
		}
		for(int i=rs1.length()-1; i>=0;i--)
		{
			rs2=rs2+rs1.charAt(i);
			
		}
		System.out.println(rs2);
		
	}

}
