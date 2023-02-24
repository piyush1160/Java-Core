package basicRecursion;

import java.util.Scanner;

public class Palidrome {


    static int rev2(int n){

        int digits =(int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private  static  int helper(int n , int digits){
        if(n%10 == n ){
            return n ;
        }
        int rem = n % 10;
        return rem * (int )Math.pow(10,digits-1)+helper(n/10 , digits-1);

    }
    //check wether no is  palindrome or not ..
    static boolean palin(int n){
        return n == rev2(n);
    }

    public static void main(String[] args) {

        System.out.println(palin(12321));
    }

}

