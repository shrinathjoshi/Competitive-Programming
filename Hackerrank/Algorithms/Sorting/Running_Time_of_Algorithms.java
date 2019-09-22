package Algorithms.Sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Shrinath
 * 
 * Hackerrank 
 * https://www.hackerrank.com/challenges/runningtime/problem
 *
 */

public class Running_Time_of_Algorithms {

	static int runningTime(int[] arr) {
        int key=0;
        int j=0;
        int count=0;
        for(int i =1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0){
                if(arr[j] > key){
                    arr[j+1] = arr[j];
                    count++;
                }
                else break;
                j--;
            }
            arr[j+1]=key;
        }
        return count;
    }

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) throws IOException {

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
        int arrItem = Integer.parseInt(arrItems[i]);
        arr[i] = arrItem;
    }

    int result = runningTime(arr);

    System.out.println(result);
    scanner.close();
}
}

/* 
INPUT:-
5
2 1 3 1 2

OUTPUT:-
4
 
 */


