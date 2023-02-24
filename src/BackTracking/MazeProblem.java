package BackTracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
      //  System.out.println(count(3,3));
        //path("",3,3);
        //System.out.println(pathlist("",3,3));

        boolean[][] arr = {
                {true ,true ,true},
                {true ,false ,true},
                {true ,true ,true},
        };

        pathRestriction("",arr ,0,0);

    }


    //how many poosible way to reach our target ....
    public static int count(int r, int c){
        if(r==1 ||c==1){
            return 1;
        }
       // int count = 0;
        int left  = count(r-1 ,c);
        int right = count(r,c-1);

        return right+left;

    }
    //path printing
    public static void path(String p , int r ,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }

        if(r>1){
            path(p + 'D' , r-1 , c);

        }

        if(c>1){
            path(p + 'R' , r, c-1);

        }


    }


    // return an list of path ....

    public static ArrayList<String> pathlist(String p , int r , int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c>1) {
            list.addAll(pathlist(p + 'D', r - 1, c-1));

        }
        if (r > 1) {
            list.addAll(pathlist(p + 'V', r - 1, c));

        }

        if (c > 1) {
            list.addAll(pathlist(p + 'H', r, c - 1));

        }

        return list;
    }

    static  void pathRestriction(String p , boolean[][] maze , int r  , int c){

        if(r == maze.length-1 && c ==  maze[0].length-1){
            System.out.println(p);
            return  ;
        }
        if(!maze[r][c]){
            return ;
        }


        if(r< maze.length-1){
            pathRestriction(p+'D',maze,r+1 , c );
        }
        if(c < maze[0].length-1){
            pathRestriction(p+'R',maze,r , c+1 );
        }

    }

 }

