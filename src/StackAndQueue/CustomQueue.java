package StackAndQueue;

public class CustomQueue {
    public int[] data ;
    int end = 0 ;
    public static final int DEFAULT_SIZE =20;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isfull()){
            System.out.println("Queue is overflow ");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty ");
        }
        int removed = data[0];
        // move elements in backward direction by 1 ...
        for(int i = 1 ; i< end ; i++){
            data[i-1] = data[i];
        }
        end-- ;
        return removed;
    }

    public int front() throws  Exception {
        if(isempty()){
            throw new Exception("Queue is empty or underflow ");
        }
        return data[0];
    }

    public void display (){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.print("End");
    }

    public boolean isfull(){
        return end == data.length; // ptr is at last index ...
    }
    public boolean isempty(){
        return end==0;
    }

}
