package Cloning;

public class Human implements  Cloneable {
    int age ;
    String name;
    int[] arr;

    Human(int age , String name ){
        this.age = age ;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};

    }
    Human( Human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       // return super.clone();
        // this is actuall shallow copy ....
        Human twin  = (Human)super.clone();

        // make a deep copy
        twin.arr = new int [twin.arr.length];
       // here this means what Piyu copy the Piyu element in twin .....
        for (int i = 0; i <twin.arr.length ; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin ;
    }
}
