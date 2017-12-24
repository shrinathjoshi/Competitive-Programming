// https://www.codechef.com/problems/PRIME1


import java.util.*;

class PRIME1
{
	public static boolean getPrime(int i)
	{

				if(i==2)
					{
						return true;	
					}
					if(i%2==0||i==1)
					{
						return false;
					}
					else
					{
						int l=(int)Math.sqrt(i);
						for(int j=3;j<=l;j=j+2)
						{
							if(i%j==0)
								return false;
						}
					}
					return true;
				

	}
	public static void main(String arga[])
	{

	long startTime = System.currentTimeMillis();

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t-->0)
		{
			int lb=sc.nextInt();
			int ub=sc.nextInt();

				for(int i=lb;(i<=ub);i++)
				{
					boolean result=getPrime(i);
					if(result==true)
						System.out.println(i);
					


		}


	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println(totalTime);
	}
}

}