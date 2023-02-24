//package BinarySearch;
//
//import java.util.Scanner;
//
//public class nextGreatestLetter {
//
//    public static void main(String[] args) {
//        Scanner cin  = new Scanner(System.in);
//        System.out.println("enter the size : ");
//        int size = cin.nextInt();
//        System.out.println("enter the element");
//
//        char[] letters = cin.next().toCharArray();
////        for(int i = 0 ;i < letters.length ;i++){
////            letters[i] = cin.nextLine();
////        }
//       // char target = cin.nextChar();
//
//        char ans = nextGreatestLetter(letters , target);
//        System.out.println(ans);
//
//
//    }
//
//    public static char nextGreatestLetter(char[] letters, char target) {
//        int start = 0;
//        int end = letters.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < letters[mid]) {
//                end = mid - 1;
//            }
////            else if( target > letters[mid]){
////                 start = mid + 1;
////            }
//            else {
//                start = mid + 1;
//            }
//        }
//        return letters[start % letters.length];
//    }
//}