package String;


import java.util.*;

public class leetPrac {
    public static void main(String[] args){

    }
    public static boolean checkInclusion(String s1, String s2) {
        String p = "";
        String up = s1;
        String p2="";
        String up2= s2;

        ArrayList<String> newlist = permutationList(p,up);
        ArrayList<String> newlist2 = permutationList2(p2,up2);

        ArrayList<ArrayList<String>> newone = new ArrayList<ArrayList<String>>();
        newone.add(newlist);
        newone.add(newlist2);

        //    ArrayList<ArrayList<String>> newtwo = new ArrayList<ArrayList<String>>();
        //    newtwo.add(newlist2);



        System.out.println(newone);
        // System.out.println(newtwo);

        if(newone.contains(newlist)){
            return true;
        }
        else{
            return false;
        }

        // ArrayList<String> newlist3 = new ArrayList<>();

        // newlist3.add(newlist2);

        // if(!newlist.contains(newlist3)){
        //    return false;
        // }

        // return true;



    }

    public static ArrayList<String> permutationList (String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0 ; i<= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f + ch + s , up.substring(1)));
        }
        return ans;
    }


    public static ArrayList<String> permutationList2(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans2 = new ArrayList<>();

        for(int i = 0 ; i<= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            ans2.addAll(permutationList(f + ch + s , up.substring(1)));
        }
        return ans2;
    }



}
