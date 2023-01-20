package CircularLinkedList;
import java.util.*;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
       list.display();

       list.delete(30);
       list.display();


    }
}
