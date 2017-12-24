import java.util.*;
import java.lang.*;

class Problem1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int temp=sc.nextInt();
		while(temp!=42)
		{
			System.out.println(temp);
			temp=sc.nextInt();
		}
	}
}