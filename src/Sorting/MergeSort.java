package Sorting;

import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();

        int[] arr = new int[size];
        for(int i = 0  ;i <arr.length ;i++){
               arr[i] = cin.nextInt();
        }

       arr =  mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //original array me change nahi hoga naya object banega


    public static int[] mergeSort(int[] arr  ){
          if(arr.length == 1 ){
              return arr;
          }
          int mid = arr.length / 2;

          int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
          int[] right =  mergeSort(Arrays.copyOfRange(arr , mid , arr.length));

          return merge(left , right);
    }

    public static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length  + second.length ];
        int i =0 , j = 0 , k= 0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // jo bach gaye na element ya to arr1 ya to arr2 ke vo arr3 me dal jaynge ..
        //copy the remaining element ..
        while( i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while( j < second.length){
            mix[k] = second[i];
            j++;
            k++;
        }
        return mix;
    }

}


