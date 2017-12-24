/**

All submissions for this problem are available.
This problem is worth 1 point

N monkeys are standing in a single file and going to dance like there's no tomorrow. Their peculiar dance is driven by certain rules, as follows:

Given a permutation of [1, 2, ... N], lets say P
Each second, all monkeys simultaneously move to new positions according to P.
The monkey at position i, moves to position P[i]
Since P is a permutation, more than one monkey are never on the same cell

Each monkey is wearing a unique tag, that identifies his initial position. When all the monkeys are simultaneously back to their initial position, there is a loud bang. Can you calculate the smallest number of seconds it will take once the monkeys' dance starts for them to return to their initial position.

Input
First line contains a number T, the number of test cases.

Each test case contains of 2 lines. First line contains a single number, N, the number of monkeys. Next line contains N numbers which define the permutation P, which the monkeys are going to use to dance.

Output
For each test case, print a single number on each line consisting of the smallest number of seconds the monkeys take to return to their initial position. You may assume that the answer always fits a 32-bit integer.

Solution Templates
In the solution templates provided, complete the function whose signature is

C / C++
int danceTime(int N, int P[100])

Java
static int danceTime(int N, int[] P)

The function should return the fewest number of seconds the monkeys take to return to their initial position.

Note: You are allowed to edit the code as you please. Add / delete headers. Add / delete methods. And so on.. So long as your final code solves the problem with Input and Output as described above. You may submit your own code, without using the template at all.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 100
Sample Input
2
3
3 2 1
11
4 11 9 6 7 1 2 5 3 8 10
Sample Output
2
6
Explanation
In the second test case, 1 - 4 - 6 are back to their initial positions after 3 seconds; 3 - 9 are back to their initial positions after 2 seconds; and 2 - 5 - 7 - 8 - 10 - 11 are back to their initial positions after 6 seconds. Overall, they take 6 seconds to return to their initial position.

*/



import java.util.*;

class DMONKEY 
{
public static void main(String args[])
{ 
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	
	while(t-->0)
	{
        int n=sc.nextInt();
        int temp[]=new int[n+1];
        int original[]=new int[n+1];
        int p[]=new int[n+1];
        for(int i=1;i<=n;i++)
            temp[i]=i;
            
            
        original=temp;   
    
    
        for(int i=1;i<=n;i++)
            p[i]=sc.nextInt();
	
	    int count=1;
	    while(true)
	    {
	        int copy[]=new int[n+1];
	        for(int i=1;i<=n;i++)
	            copy[p[i]]=temp[i];
	            
	       
	        for(int i=1;i<=n;i++)
	            temp[i]=copy[i];
	                 
	            
	        count++;
	        
	        if(Arrays.equals(original,p))
	        {   
	            
	             System.out.println("Message111");
	            break;
	        
	        }
	    }
	
	System.out.println(count);
	
	}



}


}