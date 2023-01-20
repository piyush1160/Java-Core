package LinkedList;

import java.util.LinkedList;

// insertion in all formats
//insertion using recursion ..
public class SinglyLinkedList {

    // here is the node class .
    private  class Node{
       private int value ;
       private Node next;

       Node(int value ){
           this.value = value;
       }
       Node(int value , Node next){
           this.value = value;
           this.next = next;
       }

    }

     private  int size;
     private  Node head;
     private  Node tail ;

    // inserting the node at the begining .
    // and increase the size by 1 . so we have the count of size of the list
     public  void insertFirst(int value){
         Node node = new Node(value);
         node.next = head;
         head = node;

         if(tail == null){
             tail = head ;
         }
         size+=1 ;
    }

    // insert the node at last
    public void insertLast(int value){
         if(tail== null){
             insertFirst(value);
             return;
         }
         Node node  = new Node(value);
         tail.next = node;
         tail = node ;
         size++  ;
    }

    // insert the node with the help of index
    public void insert(int value ,int index ){
         if(head==null){
             insertFirst(value);
             return;
         }
         if(tail==null){
             insertLast(value);
             return;
         }
         Node temp = head;
         //temp ko index -1 tak pochana hai .
         for(int i = 1; i< index ;i++){
             temp = temp.next;
         }

         Node node = new Node(value , temp.next);
         temp.next = node;
         size++;
    }

    // delete the first node
    public int deleteFisrt(){
         int value = head.value;
         head =head.next ;
         if(head ==null ){
             tail= null;
         }
         size--;
         return value;
    }


    // us node tak pocha do or uski value store kara lo jaha tak isko leke jana hai
    // means jis node ko delete krna hai uski previous node tak ..
    public Node getindex(int index){
         Node node =  head;
         for(int i = 0; i< index ; i++){
             node = node.next;
         }
         return node ;
    }

  // delete the last node
    public int deleteLast(){
         if(size <=1 ){
             return deleteFisrt();
         }
        int val = tail.value ;
         Node secondLast  =  getindex(size-2);

         tail = secondLast;

         // tail = getindex(size-2);  another way .....

         tail.next = null ;

         return val ;

    }

    // delete at paticular index
    public int deleteAtIndex(int index){
         if(index == 0){
             return deleteFisrt();
         }
         if(index == size -1){
             return deleteLast();
         }
         Node prev = getindex(index-1);
         int value = prev.next.value ;

         prev.next = prev.next.next;

         return value;

    }
      // detect the loop and length of the loop  ..
    // https://leetcode.com/problems/linked-list-cycle-ii/description/
//      public int lengthCycle(Node head) {
//          Node fast = head;
//          Node slow = head;
//
//          while(fast!=null && fast.next!=null){
//              slow = slow.next;
//              fast = fast.next.next ;
//
//              if(slow == fast){
//                  Node temp = slow ;
//                  int length = 0;
//
//                  do{
//                      temp = temp.next;
//                      length++;
//                  }while (temp!=slow);
//
//                  return length;
//              }
//
//          }
//          return 0;
//      }
//
//      public Node DetectCycle(Node head){
//          Node fast = head;
//          Node slow = head;
//          int length = 0 ;
//          while(fast!=null && fast.next!=null){
//              slow = slow.next;
//              fast = fast.next.next ;
//
//              if(slow == fast){
//                  length = lengthCycle(head);
//
//                break;
//              }
//              if(length == 0 ){
//                  return null;
//              }
//
//              Node f = head , s = head;
//               while(length>0){
//                   s= s.next;
//                   length--;
//               }
//               while(f!=s){
//                   f= f.next;
//                   s=s.next;
//               }
//               return s;
//
//          }
//          return null;
//      }

    // search the node via value .
    // i made this of find of boolean type
    // if we find just return true and otherwise false
   public boolean find( int value ){
         Node ptr  = head ;
         while(ptr != null ) {
             if(ptr.value == value ){
                 return true ;
             }
             // ptr ko age age move krna
            ptr = ptr.next;
         }
        // if value is not present in the linkedlist
       //so return the null .
         return false;
   }

   // insertion using recursion .....

   public void insertRec(int val , int index) {
         head= insertRec(val , index,head);
   }
   public Node insertRec(int val , int index ,Node node){
         if(index == 0){
             Node temp = new Node(val , node);
             size++;
             return temp;
         }

         node.next = insertRec(val , index-1, node.next);
         return node;
   }



    // print the linkedlist ...
    public void display (){
         Node temp = head;
         while(temp != null){
             System.out.print(temp.value + " -> ");
             // temp ko age bahadana hai taki while wali condition fullfiill hue
             temp = temp.next;
         }
        System.out.println(" END ");
    }

    // linkedlist questions
    // 1. remove duplicate node from sorted linkedlist
    public void duplicate(){
         Node node = head;
         while(node.next!=null){
             if(node.value == node.next.value){
                 node.next = node.next.next;
             }
             else{
                node=  node.next;
             }
         }
         tail = node ;
         tail.next = null;
    }

    // merge two sorted linkedlist
    // https://leetcode.com/problems/merge-two-sorted-lists/description/
    public static SinglyLinkedList merge(SinglyLinkedList first, SinglyLinkedList second){
         Node f = first.head;
         Node s= second.head;

         SinglyLinkedList ans = new SinglyLinkedList();

         while(f!=null && s!=null ){
             if(f.value < s.value){
                 ans.insertLast(f.value);
                 f= f.next;
             }
             else{
                 ans.insertLast(s.value);
                 s= s.next;
             }
         }
         while (f!=null){
             ans.insertLast(f.value);
             f= f.next;
         }

         while (s!=null){
             ans.insertLast(s.value);
             s= s.next;
         }
         return ans;
    }



}
