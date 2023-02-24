package StackAndQueue;

public class DynamicStack extends  customStack{

    public DynamicStack(int size){
        super(size);
    }

    public DynamicStack() {
        super();
      }

    @Override
    public boolean push(int item) {

        // its care for the size of the stack
        // and copy the element in the double size array
        if(this.isfull()){
            int[] temp = new int[arr.length *2] ;
            for(int i = 0 ; i<arr.length ; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        // we use super bcz it call the custom stack func so code will neat and clean

       return super.push(item);
    }
}
