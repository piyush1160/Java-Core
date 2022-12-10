package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class cyclicSort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = cin.nextInt();
        }
      //  sort(arr);
        System.out.println(Arrays.toString(sort(arr)));


    }

    public static  int[] sort(int[] arr ){
        int i = 0 ;
        while(i < arr.length){
            // jo uski correct postition hai ...
            int correct = arr[i]  - 1 ;
            if(arr[i] > 0 && arr[i] != arr[correct]){
                swap(arr ,  i , correct );
            }else{
                i++;
            }

        }
        return arr;
    }

    static void swap(int[] arr , int first , int last ){
           int temp = arr[first];
           arr[first] = arr[last];
           arr[last] = temp ;
    }

}
