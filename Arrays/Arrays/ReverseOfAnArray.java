package Arrays;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for(int tc = 0; tc < t; tc++){
		    int n = scn.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i = 0; i < n; i++){
		        arr[i] = scn.nextInt();
		    }
		    
		    for(int i = 0, j = n - 1; i < j; i++, j--){
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		    
		    for(int i=0; i < n; i++){
		        System.out.print(arr[i] + " ");
		    }
		}
	}
}