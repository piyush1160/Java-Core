package StackAndQueue;

import java.util.*;

public class customStack {
    public int[] arr ;
    public static final int DEFAULT_SIZE = 20;


    public int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size) {
        this.arr = new int[size];
    }


    public boolean push(int item){
        if(isfull()){
            System.out.println("stack is overflow");
            return false;
        }
        ptr++;
        arr[ptr] = item;
        return true;
    }

       public int pop() throws StackExcepetion {
           if(isempty()){
               throw new StackExcepetion("the item is not popped from empty stack");
           }
           int data = arr[ptr];
           ptr --;
           return  data;
       }
       public int peek() throws  StackExcepetion{
           if(isempty()){
               throw new StackExcepetion("the item is not peeked from empty stack");
           }
           return arr[ptr];
       }

    public boolean isfull(){
        return ptr == arr.length-1; // ptr is at last index ...
    }
     public boolean isempty(){
        return ptr==-1;
     }

}
