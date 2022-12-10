package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = cin.nextInt();
        }

        sort(arr , 0 , n-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr , int low  ,int hi){
        if(low>=hi){
            return ;
        }

        int s = low;
        int e = hi ;
        int m = s + (e-s)/2;

        int pivot = arr[m];

        while(s<=e){

            while(arr[s] < pivot ){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp  = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low , e);
        sort(arr,s , hi);
        
    }
}
