import java.util.*;
import java.lang.*;
import java.io.*;

class SpiralArray {

	public static void printSpiral(int arr[][],int m,int n)
	{
		int k=0,l=0;
		while(k<m&&l<n)
		{
			for(int i=l;i<n;i++)
				System.out.print(arr[k][i]+" ");
			k++;



			for(int i=k;i<m;i++)
				System.out.print(arr[i][n-1]+" ");
			n--;

        	if(k<m)
        	{
       		for(int i=n-1;i>=l;--i)
				System.out.print(arr[m-1][i]+" ");
			m--;
	
        	}
   			
   			if(l<n)
   			{

			for(int i=m-1;i>=k;i--)
				System.out.print(arr[i][l]+" ");
			l++;
	
   			}
        
		}


	}

	public static void main (String[] args) {
    
    Scanner in=new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0)
    {
 		int r=in.nextInt();
 		int c=in.nextInt();      
 		int matrix[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		matrix[i][j]=in.nextInt();
        	}
        }
        
        System.out.println();
        printSpiral(matrix,r,c);

    }

}
	
}