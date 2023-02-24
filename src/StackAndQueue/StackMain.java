package StackAndQueue;

public class StackMain {
    public static void main(String[] args) throws StackExcepetion {
//        customStack st = new customStack(5);
         DynamicStack st = new DynamicStack(5);
//        for(int i = 0 ; i < 5 ; i++){
//              st.push(i);
//        }

        st.push(10) ;
        st.push(20) ;
        st.push(30) ;
        st.push(40) ;
        st.push(50) ;
        st.push(60) ;

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
       // System.out.println(st.pop());

    }
}
