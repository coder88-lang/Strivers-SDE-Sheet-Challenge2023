//Coding ninja Problem


import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        long ans = 0;

        for (int i = 0; i<n-1; i++) {
            for (int j = i+1; j<n; j++) {
                if(arr[i] > arr[j]) 
                    ans++;
            
            }
        }
        return ans;
    }
}
