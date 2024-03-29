package String;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static void main(String[] args) {
        permutation("","abc");

        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);
    int an =     permutationCount("","abc");
        System.out.println(an);


    }

    public static void permutation(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        for(int i = 0 ; i<= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s , up.substring(1));
        }
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
    public static int permutationCount(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
          int count = 0 ;
        char ch = up.charAt(0);
        for(int i = 0 ; i<= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
        count+=  permutationCount(f + ch + s , up.substring(1));
        }
        return count;
    }
}
