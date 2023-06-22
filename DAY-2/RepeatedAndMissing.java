import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int sum = n*(n+1)/2;
        int[] ans = new int[2];

        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i<arr.size(); i++) {
            if(hs.contains(arr.get(i))) {
                ans[1] = arr.get(i);
                
            }
            else {
                hs.add(arr.get(i));
                sum = sum - (int)arr.get(i);
            }
        }
        
        ans[0] = sum;

        return ans;
    }
}
