package Cloning;
// object cloning ...

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException{
        Human Piyu = new Human (20 , "Piyush Bhatia");

        // Human twin = new Human(Piyu);

      // we use clone method for coping the age name properties of object Piyu
        Human twin  = (Human)Piyu.clone();

        System.out.println(twin.age + "  " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100 ;

        System.out.println(Arrays.toString(Piyu.arr));

        System.out.println(Arrays.toString(twin.arr));



    }
}
