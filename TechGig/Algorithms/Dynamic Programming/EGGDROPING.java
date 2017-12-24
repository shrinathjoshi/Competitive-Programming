/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class EGGDROPPING {
    
    public static int eggDrop(int t[][],int n,int e)
    {
        for(int i=2;i<(n+1);i++)
        {    for(int j=2;j<(e+1);j++)
            {
                t[i][j]=Integer.MAX_VALUE;
                    for(int x=1;x<i;x++)
                    {
                        int eggDroped=t[x-1][j-1];
                        int eggNotDroped=t[i-x][j];
                        int c=Math.max(eggDroped,eggNotDroped)+1;
                    
                        if(t[i][j]>c)
                        {
                            t[i][j]=c;
                        }
                    }
                            
            }
        }
        
      return t[n][e];  
    }
    public static void main(String args[] ) throws Exception {

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int e=sc.nextInt();
    int at[][]=new int[n+1][e+1];
    
    for(int i=0;i<n+1;i++)
        at[i][1]=i;
    
    for(int i=0;i<e+1;i++)
        at[1][i]=1;
    
    System.out.println(eggDrop(at,n,e));
    
    
    
   }
}
