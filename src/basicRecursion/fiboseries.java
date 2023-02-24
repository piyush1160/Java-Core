package basicRecursion;

public class fiboseries {
    public static void main(String[] args) {

        int ans = fibo(5);

        System.out.println(ans);
    }


    static int fibo(int n){
        // base conditon
     if(n<2){
         return n;
     }

        return  fibo(n-1) + fibo(n-2);
    }

}
