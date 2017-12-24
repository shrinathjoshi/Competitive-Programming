
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class longestIncreasingSubSequence {
public static int longestIncreasingSubsequence(int[] arr)
    {
        int t[]=new int[arr.length];
        
        for(int i=0;i<t.length;i++)
            t[i]=1;
        
        for(int i=1;i<t.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    if(t[i]<t[j]+1)
                        t[i]=t[j]+1;
                }
            }
        }
        
        
        int max=0;
        for(int i=0;i<t.length;i++)
        {
            if(t[i]>t[max])
            {
                max=i;
            }
        }
        
        return t[max];
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
        output = longestIncreasingSubsequence(ip1);
        System.out.println(String.valueOf(output));
    }
}
