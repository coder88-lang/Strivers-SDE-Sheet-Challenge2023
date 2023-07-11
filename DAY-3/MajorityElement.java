
import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Using HashMap for the count of duplicate elements
    
		HashMap<Integer,Integer> map = new HashMap<>();
  
        if(arr.length <= 1) 
            return arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                    int count = map.get(arr[i]) +1;
                    if (count > arr.length /2) {
                        return arr[i];
                    } else
                        map.put(arr[i], count);
  
            }
            else
                map.put(arr[i],1);
            }
			return -1;
	}
}
