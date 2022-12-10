package String;

import java.util.*;


public class Strings {
    public static void main(String[] args) {
        String name = "Piyush Bhatia";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
       // System.out.println("  Piyush".strip( ));
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
