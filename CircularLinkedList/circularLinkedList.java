package CircularLinkedList;

public class circularLinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
         this.value = value ;
        }
    }

    private Node head ;
    private Node tail ;

    public circularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val ){
        Node node= head;
        if(node==null){
            return ;
        }
        if(node.value == val){
            head = head.next;
            tail.next = tail ;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
       node = node.next;
        }while(node!=head);
    }

    public void display (){
        Node node = head ;
        if(head != null ){
            do{
                System.out.print(node.value + " -> ");
                node= node.next;
            }while(node!=head );
        }
        System.out.print("End");
        System.out.println();
    }

}
