package DoublyLinkedList;

public class DoublyLinkedList {

    private class Node{
        int value ;
        Node next ;
        Node prev ;

        public Node(int value) {
            this.value = value ;
        }
        public Node(int value ,Node next , Node prev){
            this.value = value ;
            this.next = next;
            this.prev = prev;
        }
    }

    int size ;
    Node head ;
    Node tail ;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null ;
        if(head != null ){
            head.prev = node;
        }
       head = node ;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node temp = head;

        if(head == null){
            node.prev = null ;
            head = node;
            return;
        }
        while(temp.next!= null){
            temp = temp.next;
        }

        node.next = null;
        temp.next = node;
        node.prev = temp;

    }

    public Node find(int value ){
        Node node = head;
        while( node!= null){
            if(node.value == value ){
                return node;
            }
            node = node.next;
        }
        return null;
    }
// insert the value after certain node or value  .
    public void insert(int after ,  int val ){
        Node prev= find(after);
        if(prev == null ){
            System.out.println("doesnot exist");
            return ;
        }
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;

        if(node.next!=null){
            node.next.prev = node;

        }
    }

    public void display(){
        Node temp  = head;
        while(temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next ;
        }System.out.println("End  ");

        // Print in reverse ...

    }
    // Print in reverse ...
    public void displayReverse(){
        Node temp  = head;
        Node last = null ;
        while(temp!= null){
            last = temp;
            temp = temp.next ;

        }


        while(last!=null ){
            System.out.print(last.value + " -> ");
            last= last.prev;
        }
        System.out.print("Start");

    }

}
