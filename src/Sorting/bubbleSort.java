package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
  public static void main(String [] args){
      Scanner cin = new Scanner(System.in);
      int n  =cin.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i<n ;i++){
          arr[i] = cin.nextInt();
      }

      bubble(arr);
      System.out.println(Arrays.toString(arr));

  }

  public static void bubble(int [] arr){
      boolean swapp  ;
      for (int i= 0 ; i<arr.length ; i++){
         swapp = false;
          for(int j = 1 ; j< arr.length - i ; j++){
              // if j is smaller than its previous value the swap it ..
              if(arr[j]< arr[j-1]){
                  int temp  = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
                  swapp = true;
              }

          }
          if(!swapp) break;
      }
  }
}
