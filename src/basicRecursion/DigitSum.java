package basicRecursion;

import java.util.Scanner;

public class DigitSum{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = sumDigitRec(n);
        System.out.println(ans);
    }
  
    //normal approach ...
    static int sumDigit(int n){
        int m=0;
       while(n!=0){ 
        int rem = n%10;
         n = n/10;
           m += rem;
        }
        return m;
    }

  // through recursion....
    static int sumDigitRec(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumDigitRec(n/10);   
    }
    
     
}