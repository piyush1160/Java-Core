package String;

import com.sun.org.apache.xpath.internal.objects.XString;

public class skipingChar {
    public static void main(String[] args) {
//         skip("" , "baccad");
//        String s = "bacapplecad";
//        String p = "apple";
//        System.out.println(s.indexOf(p));

//        System.out.println(skip("baccad"));
//        System.out.println(skipApplenotApple("bacapplecad"));

        System.out.println(skipApplenotApple("bacappecad"));


    }

    public static void skip(String p , String up ) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    public static String skip( String up ) {
        if (up.isEmpty()) {

            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
           return  skip(up.substring(1));
        } else {
            return ch +skip( up.substring(1));
        }
    }

    public static  String skipApple(String up ){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){

            return skipApple(up.substring(5));
        }else{
            return up.charAt(0)  + skipApple(up.substring(1));
        }
    }


    public static String skipApplenotApple(String up ){
         if(up.isEmpty()){
             return "";
         }

         if(up.startsWith("app") && !up.startsWith("apple")){

               return skipApplenotApple(up.substring(3));

         }else{
             return up.charAt(0) + skipApplenotApple(up.substring(1));
         }
    }


}







