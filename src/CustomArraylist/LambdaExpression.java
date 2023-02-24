package CustomArraylist;

import java.util.ArrayList;

public class LambdaExpression {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        // list.forEach((item) -> System.out.println(item *2 ));
        list.forEach((item) -> {
            System.out.println(item * 2);
        });

        Operation sum = (a, b) -> a + b;

        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaExpression myCal = new LambdaExpression();
        System.out.println(myCal.operate(5, 3 , sum));
    }

        private int operate(int a , int b , Operation op ){
             return op.operation(a,b);
        }


//    @Override
//    public int operation(int a, int b) {
//        return 0;
//    }
}

   interface Operation {
      // this is abstract method so i override this method in uper class
       int operation (int a , int b );
  }
