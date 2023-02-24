package StackAndQueue;
// queue implementation from stack s
import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item);

        // effective way
//        while(!first.isEmpty()){
//            second.push(first.pop());
//        }
//
//       first.push(item);
//        while (!second.isEmpty()){
//            first.push(second.pop());
//        }

    }
    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
        // effective way
      //  retrun first.pop();

    }

    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());

        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
