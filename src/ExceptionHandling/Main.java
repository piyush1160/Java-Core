package ExceptionHandling;
// a small example of exception handling contains of try catch and finally
// and also contain the main Exception class and subclass  ..
public class Main {


    public static void main(String[] args) {
        int a = 5 ;
        int b = 0;
        try {
            divide(a , b );
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this code is run forever . ");
        }

    }
    // throw means throwing the exception
    // throws means declaring the exception
    // means we use divide it may throws the Exception

    public static int divide( int  a , int b ) throws  ArithmeticException{
        if(b == 0 ){
            throw new ArithmeticException("don't divide by zero .. ");
        }
        return a/ b ;
    }
}
