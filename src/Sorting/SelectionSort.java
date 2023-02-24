package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class  SelectionSort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = cin.nextInt();
        }

        selection(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr , max , last);
        }
    }
       public static void swap (int[] arr , int first ,int last){
          int temp = arr[first];
          arr[first] = arr[last];
          arr[last] = temp;

       }
        public static int getMax(int[] arr , int start , int end ){
            int max = start;

            for(int i= 0; i<=end ; i++){
                if(arr[max] < arr[i]){
                    max= i ;
                }
            }
            return max;
        }

}
