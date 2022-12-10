import java.util.Scanner;

public class Solu {
    public static void main(String[] args) {

        Scanner cin  = new Scanner(System.in);
       // int n = cin.nextInt();
         String s = cin.nextLine();

        System.out.println(cou(s));

    }


     public static int cou(String s ){
         int count = 0 ;
         for(int i = 0 ;i<s.length() ; i++ ){
             char ba = s.charAt(i);
             if(Character.compare(ba,'R')==0 && (i+1)%2 ==0 ){
                 count++;
             }
             else if( Character.compare(ba,'B') == 0 && (i+1)%2!=0) {
                 count++;
             }
         }
         return count;

     }
}
