/**

Art Problem Code: MAKEART
Add problem to Todo list
Submit

  
All submissions for this problem are available.
Read problems statements in Mandarin Chinese, Russian and Vietnamese as well.
Chef's new hobby is painting, but he learned the fact that it's not easy to paint 2D pictures in a hard way, after wasting a lot of canvas paper, paint and of course time. From now on, he decided to paint 1D pictures only.

Chef's canvas is N millimeters long and is initially all white. For simplicity, colors will be represented by an integer between 0 and 105. 0 indicates white. The picture he is envisioning is also N millimeters long and the ith millimeter consists purely of the color Ci. Unfortunately, his brush isn't fine enough to paint every millimeter one by one. The brush is 3 millimeters wide and so it can only paint three millimeters at a time with the same color. Painting over the same place completely replaces the color by the new one. Also, Chef has lots of bottles of paints of each color, so he will never run out of paint of any color.

Chef also doesn't want to ruin the edges of the canvas, so he doesn't want to paint any part beyond the painting. This means, for example, Chef cannot paint just the first millimeter of the canvas, or just the last two millimeters, etc.

Help Chef by telling him whether he can finish the painting or not with these restrictions.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains a single integer N. The second line contains N space-separated integers C1, C2, ..., CN denoting the colors of Chef's painting.

Output
For each test case, output a single line containing either “Yes” or “No” (without quotes), denoting whether Chef can finish the painting or not.

Constraints
1 ≤ T ≤ 105
3 ≤ N ≤ 105
The sum of the Ns over all the test cases in a single test file is ≤ 5×105
1 ≤ Ci ≤ 105
Example
Input:
3
4
1 5 5 5
4
1 1 1 5
3
5 5 2

Output:
Yes
Yes
No

*/


import java.util.*;
 
class MAKEART
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
 
	while(t-->0)
	{
		int n=sc.nextInt();
		int canvas[]=new int[n];
		
		for(int i=0;i<n;i++)
		{	canvas[i]=sc.nextInt();
		}
		
		int flag=0;
		for(int i=1;i<n-1;i++)
		{
			if(canvas[i]==canvas[i-1]&&canvas[i]==canvas[i+1])
			{
			    flag=1;
		            break ;
			}
		
		}
	
	    if(flag==1)
		    System.out.println("Yes");
	    else
		    System.out.println("No");
	}
 
 
}
 
 
}
 