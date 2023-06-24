import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        boolean ans = false;
        int row = mat.size();
        int col = mat.get(0).size();
        int l = 0, h = row * col - 1;
 
        while (l <= h) {
            int mid = l + (h - l) / 2;
 
            int tC = mid % col;
            int tR = mid / col;
            int val = mat.get(tR).get(tC);
            if (val == target)
                return true;
 
            if (val < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
        
        return ans;
        
    }
}
