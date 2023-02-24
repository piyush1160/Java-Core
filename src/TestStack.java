
import java.util.*;

class Stack
{
    private final int size;
    int arr[] ;
    int count;
    Stack(int size)
    {
        count = -1;
        this.size = size;
        arr = new int[size];
    }
    void push(int item , int stacksize)
    {
        if(count  == stacksize)
            System.out.println("Stack is full.");
        else
            arr[++count] = item;
    }
    int  pop()
    {
        if(count < 0)
        {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return arr[count--];
    }
}
public class TestStack
{
    public static void main(String args[]) {
        // {


        // 	for(int i=0; i<10; i++) {
        // 		s1.push(i);
        //     }
        // 	for(int i=0; i<10; i++){
        // 		System.out.println(s1.pop());
        //     }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements :");
        int stackSize = sc.nextInt();
      //Stack st = new Stack<>();

        Stack  s1 = new Stack(stackSize);

        System.out.println("Enter " + stackSize + " elements :");

        int i = 0;
        while(i < stackSize){

            int number = sc.nextInt();
            s1.push(number , stackSize);
            i++;
        }

         for(int j=0 ; j<stackSize ;j++){
             System.out.print(s1.pop());
         }


    }
}