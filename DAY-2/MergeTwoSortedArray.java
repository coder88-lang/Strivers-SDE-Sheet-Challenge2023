//WAY-1 = Coding ninja problem, without using extra space
import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int ans[] = new int[m+n];  //resultant array
        int i = 0; //pointing to array 1
        int j = 0; //pointing to array 2
        int count  = 0; //starting index of resultant array

        while(i < m && j < n) {
            if(arr1[i] < arr2[j]) {
                ans[count++] = arr1[i++];
            
            } else {
                ans[count++] = arr2[j++];
            }

        

        }

        //remaining elements of arr1
        while(i < m) {
            ans[count++] = arr1[i++];
        
        }

        //remaining element of arr2
    
        while (j < n) {
            ans[count++] = arr2[j++];
        
        }
        return ans;
    }
}

/*WAY-2 = Leetcode problem, without using extra space

public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; 
        //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
 
            }else{
               
                nums1[k--] = nums2[j--];
            }
        }
    }





*/
