package DoublyLinkedList;

import DoublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
         DoublyLinkedList list = new DoublyLinkedList();
         list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(100);
       list.insert(40 , 45);
        list.display();
        list.displayReverse();



    }
}
