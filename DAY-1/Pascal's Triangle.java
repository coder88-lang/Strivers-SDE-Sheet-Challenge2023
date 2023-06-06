
import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
			ArrayList<ArrayList<Long>> ans = new ArrayList<>();

         for (long row = 1; row <= n; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static ArrayList<Long> generateRow(Long numRows) { 
        long ans = 1;
        ArrayList<Long> ls = new ArrayList<>();
        ls.add((long)1);
        for (long i = 1; i < numRows; i++) {
            ans = ans * (numRows-i);
            ans  = ans/i;
            ls.add(ans);
        }
        return ls;
	}
}
