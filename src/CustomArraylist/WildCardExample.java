package CustomArraylist;

import java.util.Arrays;

public class WildCardExample<T extends Number> {
     private  Object[] data ;
     private static int DEFAULT_SIZE =10;
     private int size = 0 ;


    public WildCardExample() {

        data = new Object[DEFAULT_SIZE];
    }

//    public void getList(List< ? extends Number> list){
//        // do something
//    }



    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num ;
     }
    private void resize(){
        Object[] temp = new Object[data.length *2 ];

        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }
     private boolean isFull(){
        return size == data.length ;
     }
   
     public T remove(){
        T removed  = (T)data[--size];
        return removed;
     }

     public T get(int index) {
       return (T)data[index];
     }
     public int size(){
        return size ;
     }
       public void set(int index , int value){
            data[index] = value;
       }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
        WildCardExample<Integer> list = new WildCardExample<>();
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);


        System.out.println(list);


    }

}
