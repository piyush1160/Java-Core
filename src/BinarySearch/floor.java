package BinarySearch;

import java.util.Scanner;


public class floor {
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

        System.out.println( " no which is lower than taregt : " + floor(arr ,target  )) ;
    }

    // return greatest no <= taregt
    // which is greater no in array but less than the target ...
    static int floor(int arr[] , int target )
    {
        int s =0 ;
        int e = arr.length-1;

        while(s<=e){
            int m = s+ (e-s)/2;

            if(arr[m]== target){
                return arr[m];
            }
            if(target<arr[m]){
                e = m-1;
            }
            else if(target>arr[m]){
                s = m+1;
            }
        }
        return arr[e];
    }
}



