package String;

import java.util.ArrayList;
import java.util.Collections;

public class dicePrac {
    public static void main(String[] args) {
            dice("",4);
        System.out.println(dicearr("",4));
        System.out.println(diceFace("",3,6));
    }


    public static String dice(String p , int target){
        if(target==0){
            System.out.println(p);
            return p;
        }

        for(int i= 1 ;i<=6 && i<=target ; i++){
            dice(p+i , target-i);
        }

        return p;
    }

    public static int diceFace(String p , int target ,int face){
        if(target==0){
            System.out.println(p);
            return 0 ;
        }
       int count =  0;
        for(int i= 1 ;i<=face && i<=target ; i++){
            //int sum = 0;
            diceFace(p+i , target-i,face);
            count++;
        }
        return count;
    }

    public static ArrayList<String> dicearr(String p , int target){
        if(target==0){
           ArrayList<String > list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String > nlist = new ArrayList<>();
        for(int i= 1 ;i<=6 && i<=target ; i++){
            nlist.addAll(dicearr(p + i, target - i));
        }
        return nlist;

    }
}
