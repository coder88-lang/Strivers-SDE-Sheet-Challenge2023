
//coding ninja solution
import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int ans = 0;

        Set<Integer> hs = new HashSet();

        for (int i = 0; i<arr.size(); i++) {
            if(hs.contains(arr.get(i))) {
                ans = (int)arr.get(i);
            } else {
                hs.add(arr.get(i));
            }
        }

        return ans;
    }
}


/* Leetcode solution

public int findDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i<nums.length; i++) {
            if(hs.contains(nums[i])) {
                return nums[i];
            } else {
                hs.add(nums[i]);
            }
        }
        return 0;
    }

*/
