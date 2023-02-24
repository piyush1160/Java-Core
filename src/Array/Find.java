package Array;

import java.util.ArrayList;

// LINEAR SEARCH ...
public class Find {
    public static void main(String[] args) {
        int[] arr= { 1, 2,4 ,4 ,5 };
//        System.out.println(find(arr,17,0));
//        System.out.println(findIndex(arr,17,0));
//        findAllIndex(arr, 4 , 0);
//        System.out.println(List);
//         ArrayList<Integer> ans = findAllIndex(arr , 4, 0 , new ArrayList<>());
//        System.out.println(ans);
        ArrayList<Integer> ans = findAllIndex2(arr , 4, 0);
        System.out.println(ans);

    }

    // return  true or false ... if element is present or not ..
    static boolean find(int[] arr , int target , int index)
    {
        if(index == arr.length){
            return false;
        }
        return arr[index]== target || find(arr,target,index+1);
    }

    // return index no = if element is present   and for not return -1 .
    static int findIndex(int[] arr , int target , int index)
    {
        if(index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

   // checking from last index ...
    static int findLastIndex(int[] arr , int target , int index)
    {
        if(index == -1){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }
        else {
            return findLastIndex(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> List = new ArrayList<>();
    static void findAllIndex(int [] arr , int target , int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target ){
            List.add(index);
        }
        findAllIndex(arr, target , index+1);
    }


    static ArrayList<Integer> findAllIndex(int [] arr , int target , int index , ArrayList<Integer> List ){
        if(index == arr.length){
            return List ;
        }
        if(arr[index] == target ){
            List.add(index);
        }
         return findAllIndex(arr, target , index+1 , List);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr , int target , int index ){
        ArrayList<Integer> List = new ArrayList<>();
        if(index == arr.length){
            return List;
        }
        if(arr[index] == target){
            List.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr , target , index+1);
//        List.addAll(ansFromBelowCalls);
             ansFromBelowCalls.addAll(List);
        return ansFromBelowCalls;
    }

}
