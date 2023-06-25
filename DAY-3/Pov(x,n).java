// Leetcode
 class Solution {
    public double myPow(double x, int n) {
         double ans = Math.pow(x, n);
         return ans;     
    }
}


// Coding ninja

import java.io.*;
import java.util.* ;

public class Solution {
    public static int modularExponentiation(int A,int B, int C) {
    if (A == 0)
        return 0;
    if (B == 0)
        return 1;
     
    // If B is even
    long y;
    if (B % 2 == 0)
    {
        y = modularExponentiation(A, B / 2, C);
        y = (y * y) % C;
    }
     
    // If B is odd
    else
    {
        y = A % C;
        y = (y * modularExponentiation(A, B - 1,
                             C) % C) % C;
    }
     
    return (int)((y + C) % C);
    }
}

