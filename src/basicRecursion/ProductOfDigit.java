package basicRecursion;

import java.util.Scanner;
public class ProductOfDigit {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = prod(n);
        System.out.println(ans);
    }
    //recursion approach ..
    static int prod(int n){
        if(n%10 == n){
            return n;
        }
       return (n%10) * prod(n/10);
    }
  
}
