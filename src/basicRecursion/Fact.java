package basicRecursion;//package Recursion;
import java.util.*;

public class Fact{
     public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = sum(n);
        System.out.println(ans);

      }
     static int fact(int n){
        //base condition
        if(n<=1){
            return 1;
        }
        //recursion...
        return n * fact(n-1);
     }
     
     static int sum(int n) {
         //base condition
         if (n <= 1) {
             return 1;
         }
         //recursion...
         return n + sum(n - 1);
     }

}
