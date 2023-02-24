package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortInplace {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size = cin.nextInt();

        int[] arr = new int[size];
        for(int i = 0  ;i <arr.length ;i++){
            arr[i] = cin.nextInt();
        }

         mergeSortInplace(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }


      public static void mergeSortInplace(int[] arr, int s, int e)
      {
        if(e-s == 1 ){
            return ;
        }
        int m = (s+e ) / 2;
        mergeSortInplace(arr, s , m);
        mergeSortInplace(arr , m , e);

         mergeInplace(arr ,s , m , e);
    }

  static void mergeInplace(int[] arr ,int s , int m , int e ){
        int[] mix = new int[e-s];
        int i =s , j = m , k= 0;

        while( i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // jo bach gaye na element ya to arr1 ya to arr2 ke vo arr3 me dal jaynge ..
        //copy the remaining element ..
        while( i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while( j < e){
            mix[k] = arr[i];
            j++;
            k++;
        }


        for(int l = 0 ; l< mix.length ; l++){
            arr[s+l] = mix[l];
        }
    }
}
