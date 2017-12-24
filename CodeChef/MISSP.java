
/**

Chef and Dolls Problem Code: MISSP Solved Submit

  
All submissions for this problem are available.
 

Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which all dolls have paired.One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..

Input
The first line contains the number of test cases. 
Second line of the input contains the number of elements in the array. 
The next n lines are the types of each doll that is left.
Output
Find the type of doll that doesn't have a pair

Constraints
1<=T<=10 
1<=N<=100000 (10^5) 
1<=ti<=100000 
Input:
1
3
1 
2
1


Output:
2


Input:
1
5
1
1
2
2
3
Output:
3


*/





import java.util.*;
 
class MISSP
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	
	while(t-->0)
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		long hash[]=new long[100000];
		
		for(int i=0;i<n;i++)
		{	
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{	
			hash[arr[i]]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			hash[arr[i]]++;
		}
		
		for(int i=0;i<100000;i++)
		{
			if(hash[i]%2==1)
				System.out.println(i);
		}
		
			
	}
	
 
}
} 