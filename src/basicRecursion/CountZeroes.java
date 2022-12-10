package basicRecursion;

public class CountZeroes {
     public static void main(String[] args) {
         System.out.println(count(140401));
     }

     static int count(int n ){
         return helper(n,0);
     }
     // how to pass the value above the calls ....
     private static int helper(int n , int counter){
         if(n==0){
             return counter;
         }
         int rem = n % 10;
         if(rem==0){
             return helper(n/10 , counter+1);
         }
         return helper(n/10 , counter);

     }
 }
