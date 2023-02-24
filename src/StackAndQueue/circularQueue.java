package StackAndQueue;

public class circularQueue {
    public int[] data;
    public static final int DEFAULT_SIZE =20;
    public int end = 0 ;
    public int front =0 ;
    public int size = 0 ;

    public circularQueue() {
        this(DEFAULT_SIZE);
    }

    public circularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isfull(){
        return size == data.length; // ptr is at last index ...
    }
    public boolean isempty(){
        return size==0;
    }
    public boolean insert(int item){
        if(isfull()){
            System.out.println("Queue is full ");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true ;
    }

    public int remove() throws Exception{
        if(isempty()){
           throw new Exception("queue is empty ");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int Front() throws Exception {

        if(isempty()){
            throw new Exception("queue is empty ");
        }
        return data[front];
    }

    public void display() {
        if(isempty()){
//            throw new Exception("queue is empty ");
            System.out.println("queue is empty");
            return ;
        }
        int i = front ;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;

        }while(i!=end);
        System.out.println("End");
    }

}
