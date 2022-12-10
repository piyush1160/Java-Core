import java.util.Scanner;
//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
public class PalindromeString {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
          String st = cin.nextLine();

        System.out.println(check(st));
    }

    static boolean check(String str) {
        if (str == null || str.length() == 0) {
            return false;

        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
              if(start!=end){
                  return false;
              }
        }
        return true;
    }
}
