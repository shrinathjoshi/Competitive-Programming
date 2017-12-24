import java.util.*;
import java.lang.*;

class Problem2
{
    public static boolean checkPrime(int Number)
    {
        for(int i=3;i<=Math.sqrt(Number);i=i+2)
        {
            if((Number%i)==0)
                return false;
        }
        
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	
	    for(int j=1;j<=t;j++)
	    {
	        
	   	    int lower_limit=sc.nextInt();
		    int upper_limit=sc.nextInt();
	        
	        for (int i=lower_limit;i<=upper_limit;i++)
	        {
	            
	           if(i==2)
                    System.out.println(i);
	            
	            if((i%2==1)&&(i!=1)&&(checkPrime(i)))
	                System.out.println(i);
	          
	        }
	    
	            System.out.println();
	    }
	}
}