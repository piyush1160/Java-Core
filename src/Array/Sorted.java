package Array;

public class Sorted {
    public static void main(String[] args) {
    //  int[] arr = {1, 2, 3, 4, 5,6};   // true case
        int[] arr = {1, 2, 4, 5, 5,6};   // false case
       System.out.println(sort(arr ,0 ));
    }

    static boolean sort(int[] arr , int index){
       if(index == arr.length-1){
           return true ;
       }
       return arr[index] < arr[index+1] && sort(arr , index+1);
    }


}
