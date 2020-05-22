import java.util.*;
class time
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int h1,m1,s1,h2,m2,s2;
		System.out.println("ENTER TIME 1 in hrs min and sec");
		
		h1=sc.nextInt();
		m1=sc.nextInt();
		s1=sc.nextInt();
		System.out.println("ENTER TIME 2 in hrs min and sec");
		h2=sc.nextInt();
		m2=sc.nextInt();
		s2=sc.nextInt();
		h1=h1+h2;
		m1=m1+m2;
		s1=s1+s2;
		if(s1>=60)
		{
		while(s1>=60)
		{
			m1=m1+1;	
			s1=s1-60;
		}
		}
		if(m1>=60)
		{
		while(m1>=60)
		{
			h1=h1+1;	
			m1=m1-60;
		}
		}
		System.out.println("TOTAL TIME hrs="+h1+" min="+m1+" sec="+s1);
	}
}