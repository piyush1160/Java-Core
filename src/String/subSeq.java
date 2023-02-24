package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class subSeq {
    public static void main(String[] args){
//        subseq("","abc");
//        System.out.println(subSeqReturn("" , "abc"));
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = cin.nextInt();
        }

        List<List<Integer>> ans = subsetDuplicate(arr);
        for(List<Integer> list : ans){
            System.out.print(list+" ");
        }

    }

    public static void subseq(String p , String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);

        subseq(p+ch , up.substring(1));
        subseq(p , up.substring(1));
    }

    public static ArrayList<String> subSeqReturn(String p , String up ){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
       char ch = up.charAt(0);

        ArrayList<String> left = subSeqReturn(p+ch , up.substring(1));
        ArrayList<String> right = subSeqReturn(p , up.substring(1));

         left.addAll(right);
      //   right.addAll(left); // print the reverse order ...
         return left;
     }
     static List<List<Integer>> subset (int[] arr){
         List<List<Integer>> outer = new ArrayList<>();
         outer.add(new ArrayList<>());
         for (int nums : arr) {
             int n = outer.size();
             for(int i = 0; i<n ; i++){
                 List<Integer> internal = new ArrayList<>(outer.get(i));
                 internal.add(nums);
                 outer.add(internal);
             }
         }
         return outer ;
     }

     static List<List<Integer>> subsetDuplicate (int[] arr){
         Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int s = 0 ;
        int e = 0;
        for (int i= 0 ; i< arr.length ; i++) {
            s = 0 ;
            // if cuur and prev element are same s =e +1 ;
            if(i>0 && arr[i] == arr[i-1]){
                s=e+1;
            }
            e = outer.size() -1 ;

            int n = outer.size();

            for(int j = s; j < n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer ;
    }


}
