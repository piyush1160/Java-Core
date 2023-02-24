

  import java.util.*;

          import java.util.*;
          import java.io.*;

public class MAin {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- != 0)
        {
            int n,x;
            n=sc.nextInt();
            x=sc.nextInt();

            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }


            int i = 0 ;
            while ( i<arr.length){
                int correct =arr[i]-1;
                if(arr[i] != arr[correct]){
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }else {
                    i++;
                }
            }
            int sum=0;
            int count=0;

            for( int j = 0 ;  j< arr.length ; j++){
                if ( arr[j]> 0 &&(arr[j] == j+1) && sum < x){
                    sum = sum + arr[j];
                    count++;
                    System.out.println(count +" ");
                }
            }

            System.out.println(count);
        }

    }
}