import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class  MinimumCoins {
    /*
     * Complete the function below.
    */
    public static int minimumCoins(int[] coins,int total)
    {

    int r[]=new int[total+1];
    int p[]=new int[total+1];
    
    r[0]=0;
    for(int i =1;i<total+1;i++)
        r[i]=Integer.MAX_VALUE-1;
    
    for(int i =0;i<total+1;i++)
        p[i]=-1;
    
    for(int i=0;i<coins.length;i++)
    {
        for(int j=1,h=0;j<total+1;j++)
        {
            if(j>=coins[i])
            {
               System.out.println("-->>"+j); 
                int notTaken=r[j];
                int Taken=r[j-coins[i]]+1;
                
                System.out.println("TAKEN :"+Taken+"\n NOT TAKEN :"+notTaken+"\n");
                if(Taken<=notTaken)
                {
                    System.out.println("***"+r[j]+"***"+p[j]);
                    r[j]=Taken;
                    p[j]=i;
                }
            }
            
        }
    }
   
   
   for(int i:r)
    System.out.println(i);
    
    System.out.println("\n----");
    return r[total];
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        int[] ip1 = new int[ip1_size];
        int ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            ip1_item = Integer.parseInt(in.nextLine().trim());
            ip1[ip1_i] = ip1_item;
        }
        int ip2 = Integer.parseInt(in.nextLine().trim());
        output = minimumCoins(ip1,ip2);
        System.out.println(String.valueOf(output));
    }
}