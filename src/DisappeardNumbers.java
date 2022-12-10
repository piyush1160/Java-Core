import java.util.*;
public class DisappeardNumbers
{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n  =cin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n  ;i++){
            arr[i] = cin.nextInt();
        }
      List<Integer> amm =   findDisappearedNumbers(arr);
    //    System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(new List[]{amm}));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0 ;
         while( i < nums.length ) {
             int correct =  nums[i]- 1;
             if(nums[i] != nums[correct] ){
                 swaps(nums , i , correct );
             }
             else{
                 i++;
             }
         }

         
         // for find the missing numbers ... 
          List<Integer> ans = new ArrayList<>();
          for(int j = 0 ; j < nums.length ; j++){
               if(nums[j] != j+1 ){
                   ans.add(j+1);
               }

         }
         return ans;

    }

    public static void swaps(int [] nums , int i , int j){
                int temp = nums[i];
                nums[i] = nums[j] ;
                nums[j] = temp;
                
             }

}



