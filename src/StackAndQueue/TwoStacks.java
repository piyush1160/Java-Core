package StackAndQueue;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStacks {
    public static int twoStacks(int x , int[] a ,int[] b){
        // total count  me se -1 ..
        return twoStacks(x , a,  b,0 ,0 ) - 1 ;
    }
    private static int twoStacks(int x , int[] a , int[] b , int sum , int count) {
        if(sum > x) {
            return count ;

        }
        if(a.length == 0 || b.length == 0){
            return count ;
        }
        int ans1 = twoStacks(x , Arrays.copyOfRange(a ,1, a.length),b , sum+a[0] , count+1);
        int ans2 = twoStacks(x, a , Arrays.copyOfRange(b,1 ,b.length), sum+b[0] , count+1);

        return Math.max(ans1 , ans2);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // t =  for test cases....
        int t = cin.nextInt();
        for(int i =0; i<t ; i++){
            // n = size of a ..
            int n = cin.nextInt();
            // m = size of b
            int m = cin.nextInt();
            // x =  sum of no ... i.e a specific range ..
            int x = cin.nextInt();

            int[] a =new int[n];
            int[] b = new int[m];

            //input of a[] and b[]
            for(int j = 0 ; j< n ; j++){
                a[j] = cin.nextInt();
            }
            for (int k = 0; k < m; k++) {
                b[k] = cin.nextInt();
            }
            System.out.println(twoStacks(x,a,b));
        }
    }
}

//        1        -- no of test case
//        5 4 10     -- 5 and 4 is array size   and 10 is the range of sum
//        4 2 4 6 1
//        2 1 8 5
//        4      // it is the ans
