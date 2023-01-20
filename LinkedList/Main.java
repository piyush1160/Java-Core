package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list  = new SinglyLinkedList();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertFirst(40);
//        list.insertFirst(50);
//        list.display();
        System.out.println("------------------");

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insert(35 , 3);
        list.display();

//        System.out.println(list.deleteFisrt());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.deleteAtIndex(1));
//        list.display();
//        System.out.println(list.find(20));
        System.out.println("add item in list using the recurion .");
        list.insertRec(25 ,1);
        list.display();


        // new linkedlist create krenge duplicate
//        System.out.println("remove duplicate from sorted list");
//        SinglyLinkedList list1 = new SinglyLinkedList();
//        list1.insertLast(1);
//        list1.insertLast(1);
//        list1.insertLast(1);
//        list1.insertLast(2);
//        list1.insertLast(4);
//        list1.insertLast(4);
//        list1.display();
//        list1.duplicate();
//        list1.display();
        System.out.println("-------------------");

        System.out.println("Merge two sorted LinkedList ");
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.insertLast(1);
        l1.insertLast(3);
        l1.insertLast(5);

        SinglyLinkedList l2 = new SinglyLinkedList();
        l2.insertLast(1);
        l2.insertLast(2);
        l2.insertLast(9);
        l2.insertLast(14);

       SinglyLinkedList ans = SinglyLinkedList.merge(l1,l2);
       ans.display();




    }
}
