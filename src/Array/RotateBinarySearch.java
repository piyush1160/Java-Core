package Array;

import java.util.Scanner;

public class RotateBinarySearch {
    public static void main(String[] args) {
        //int[] arr = {5 ,6,7, 8 ,9, 1, 2, 3 };
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the size of the array : ");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the element of the array :");
        for(int i=0 ; i<arr.length ;i++){
            arr[i] = cin.nextInt();
        }
        System.out.println("enter the Target : ");
        int target = cin.nextInt();
        System.out.println(" the result is :  " + Search(arr , target, 0, arr.length -1 ));
    }
    static  int Search(int[] arr , int target ,int s , int e){
        //Base condition
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m]== target){
            return m;
        }
        if(arr[s] <= arr[m] ){
            if(target >= arr[s] && target <= arr[m] ){
                return Search(arr ,target, s ,m-1);
            }
            else{
                return Search(arr ,target, m+1 ,e);
            }
        }
        if(target >= arr[m] && target<=arr[e]){
            return Search(arr , target , m+1 , e);
        }

            return Search(arr ,target, s ,m-1);

    }
}
