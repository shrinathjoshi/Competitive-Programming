
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LongestBitonicSubSequence {
 public static int LongestBitonicSubsequence(int[] arr)
    {
        int t1[]=new int[arr.length];
        int t2[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            t1[i]=t2[i]=1;
        }
        
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i] > arr[j])
                {
                    if(t1[i]<t1[j]+1)
                    {
                        t1[i]=t1[j]+1;
                    }
                }
            }
        }


        for(int i=arr.length-2;i>=0;i--)
        {
            for(int j=arr.length-1;j>i;j--)
            {
                if(arr[i]>arr[j])
                {
                    if(t2[i]<t2[j]+1)
                    {
                        t2[i]=t2[j]+1;
                    }
                }
            }
        }
        
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<t1[i]+t2[i]-1)
            {
                max=t1[i]+t2[i]-1;
            }
        }
        
        
        return max;
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
        output = LongestBitonicSubsequence(ip1);
        System.out.println(String.valueOf(output));
    }
}


