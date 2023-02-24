package Sorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = cin.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void insertion(int[] arr){
        for(int i = 0 ; i<arr.length-1 ; i++ ){
            for(int j = i+1 ; j > 0 ; j-- ){
                if(arr[j] < arr[j-1]){
                    swap( arr, j ,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap( int[] arr , int i, int j) {

        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;

    }
}
