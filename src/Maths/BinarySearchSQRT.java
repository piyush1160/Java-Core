package Maths;

import java.util.Scanner;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int p = cin.nextInt();
      //  double ans = root(n ,p );
        System.out.printf("%.3f" , rootsqr(n ,p ));
      //  System.out.println(root(n,p));

    }


    public static double rootsqr(int n , int p ){
        int s = 0 ;
        int e = n ;
        double root = 0.0;
        while (s<=e){
            int m = s + (e-s)/2;
            if(m*m == n ){
                return m;
            }
            if(m*m > n){
                e = m -1 ;
            }
            else{
                s = m+1;
            }
           // root = m-1 ;
        }


        double inc = 0.1;
        System.out.println(root);
        //loop  tab tak chalegi ki kitne no tk  round off krana hai vo value
        for(int i = 0 ; i<p; i++){
            while(root*root <=n){
                root+=inc;
            }
            root-=inc; // ek step back jane ke liye
            inc/=10;  // points ko age badane ke liye
        }
        return root;
    }
}

