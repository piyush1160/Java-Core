package String;

import java.util.*;

class Demo{
    int val =10 ;
    Demo(){
        System.out.println("1002");
    }
}

public class Strings {
    public static void main(String[] args) {
        String name = "Piyush Bhatia";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
       // System.out.println("  Piyush".strip( ));
        System.out.println(Arrays.toString(name.split(" ")));

        Demo dm = new Demo();
        System.out.println(dm);

//        String s1 = "aba";
//        char ch;
//        String s2 = s1 ;
//        String s3 = "";
//        for(int i = 0 ; i<s1.length() ; i++){
//              ch = s1.charAt(i);
//              s3 = ch+s3;
//        }
//        System.out.println(s3);
//        if(s1== s3){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("No");
//        }

          int n =12321 ,r ;
          int n1 = 8;int count =0 ;
          int temp = n ;
          int sum = 0;

          while(n>0){
              r = n%10 ;
              if(r == n1){
                  count++;
              }

              sum = (sum*10)+r;
              n=n/10;
          }
        System.out.println(count);
        System.out.println(sum);
          if(temp == sum){
              System.out.println("yes");
          }
          else{
              System.out.println("no");
          }



          int[] arr = {10,29,39,49,79,69};
          int[] arr2 = arr ;
           

    }
}
