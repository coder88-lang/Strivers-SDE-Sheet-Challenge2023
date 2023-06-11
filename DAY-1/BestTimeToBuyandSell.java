
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
         int max = 0;
        int minp = Integer.MAX_VALUE;

        for (int i = 0; i<prices.size(); i++) {
            minp = Math.min(minp, prices.get(i));
            max = Math.max(max, prices.get(i)-minp);
        }
        return max;
    }
}
