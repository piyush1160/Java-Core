package StackAndQueue;

public class DynamicQueue extends circularQueue {
    public DynamicQueue() {
        super(DEFAULT_SIZE);
    }

    public DynamicQueue(int size) {
        super(size);
    }
    public boolean push(int item) {

        // its care for the size of the stack
        // and copy the element in the double size array
        if(this.isfull()){
            int[] temp = new int[data.length *2] ;
            for(int i = 0 ; i<data.length ; i++){
                temp[i] = data[(front + i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        // we use super bcz it call the custom stack func so code will neat and clean

        return super.insert(item);
    }
}
