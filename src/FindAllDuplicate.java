import  java.util.*;
public class FindAllDuplicate{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n ;i++){
            arr[i] = cin.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> ans = findDuplicates(arr);
        System.out.println(Arrays.toString(arr));
       // System.out.println(Arrays.toString(new List[]{ans}));
       // System.out.println(Arrays.toString(new List[]{ans}));
        System.out.println(ans);

    }
    public static List<Integer> findDuplicates(int[] arr) {
        
        int i = 0 ; 
        while(i < arr.length ){
            int correct = arr[i] -1 ;
            if(arr[i] !=arr[correct]){
                swap(arr ,  i  ,correct );
            }
            else{
                i++;

            }

        }


         List<Integer> ans = new ArrayList<>();
         for(int j = 0 ; j<arr.length ;j++){
             if(arr[j] != j + 1){
                 System.out.println(arr[j]);
                ans.add(arr[j]);

             }
         }
         return ans;
    }

    static void swap (int[] arr, int f , int l ){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}