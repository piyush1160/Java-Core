package StackAndQueue;
import java.util.*;
public class InbuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        for(int i =0 ;i<10 ;i++){
//            System.out.println(st.push(i));
//        }
//        System.out.println("--------------------");
//        for(int i = 0 ;i<10; i++){
//            System.out.println(st.pop());
//        }


//        Queue<Integer> q = new LinkedList<>();
//        for(int i =0 ;i<10 ;i++){
//            q.add(i);
//        }
//        for(int i = 0 ;i<10; i++){
//            System.out.println(q.remove());
//        }

         Deque<Integer> deck = new ArrayDeque<>();
         deck.add(10);
         deck.add(20);
        deck.add(25);
         deck.addFirst(5);

        // deck.addLast(30);

        System.out.println(deck.remove());
        System.out.println(deck.remove());
        System.out.println(deck.remove());
     //   System.out.println(deck.remove());
        System.out.println(deck.peek());


    }
}
