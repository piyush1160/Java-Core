package BinarySearch;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        // int arr[] = {10,20,30,40,50,60,70 };
        // int target = 30;
         
         Scanner cin = new Scanner(System.in);
           System.out.println("enter the size of array..");
          int size = cin.nextInt();
          int[] arr = new int[size];
          System.out.println("enter the element of array ..");
          for(int i=0 ;i<size ;i++){
               arr[i] = cin.nextInt();
          }
          System.out.println("enter the target .. ");
          int target =cin.nextInt();

         System.out.println( "INDEX of array : " + binarySearch(arr ,target , 0 , arr.length-1 )) ;
    }

    static int binarySearch(int arr[] , int target , int s , int e){
        if(s>e){
        // element is not found .....
            return -1;
        }
        int m= s+ (e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if(target < arr[m]){
            return  binarySearch(arr , target , s ,m-1);
        }
        return  binarySearch(arr , target , m+1 ,e);
    }
}
