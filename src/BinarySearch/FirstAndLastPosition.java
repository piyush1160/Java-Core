package BinarySearch;

import java.util.*;

//import java.util.Arrays;
//import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Scanner cin  =  new Scanner(System.in);
        System.out.println("enter the size : ");
        int size = cin.nextInt();
        int[]  nums = new int[size];
        System.out.println("enter the element : ");
        for(int i = 0 ; i< size ; i++){
            nums[i] = cin.nextInt();
        }
        System.out.println("enter the target : ");
        int target = cin.nextInt();
       int[] newans = SearchRange(nums , target);
        System.out.println("the range of target is " + Arrays.toString(newans));

    }

    public static int[] SearchRange(int[] nums , int target){
        int[] ans= {-1 , -1};
        // check for target at first or not ....
        ans[0] = search(nums ,target, true);
        if(ans[0] != -1)
          ans[1] = search( nums , target , false);

       return ans;
    }
  // this function return the index of first Start index ....
    public static int search(int[] nums, int target, boolean FirstStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1 ;

        while(start<=end){
            int mid = start + (end - start)/2;
//            if(nums[mid]== target ){
//                return mid ;
//            }
            if (target < nums[mid]){
                end = mid -1;

            }
            else if(target> nums[mid]){
                start = mid + 1;
            }
            else {
                ans = mid ;
                if(FirstStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
