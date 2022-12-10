package basicRecursion;

import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        // func(5);
        //   funcRev(5);

        concpt(5);
    }



    static void concpt(int n){
        if (n==0) {
            return ;
        }

//        concept(n--);  infinite loop bcz it pass the value first and then subtract
        System.out.println(n);
          concpt(--n);


    }


    static void func(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        func(n-1);
    }
    //5 4 3 2 1
   
    static void funcRev(int n){
        if(n==0){
            return ;
        }
        funcRev(n-1);
        System.out.println(n);
    }
    //1 2 3 4 5
    
}
