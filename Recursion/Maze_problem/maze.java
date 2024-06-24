package Maze_problem;

import java.util.ArrayList;



public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));

        // path("" , 3 , 3) ; 
        // System.out.println(pathRet("", 3, 3)) ;   
        System.out.println(pathRetDaigonal("" , 3 , 3)) ;
    }
    // count the number of ways are possible 
    static int count(int r , int c ){
        // base condition  
        if(r == 1 || c == 1) {
            return 1 ;
        }
        int left = count(r-1 , c) ;
        int right = count(r , c -1) ;

        return (left + right );
    }

    // print the path followed 

    static void path(String p , int r , int c ){
        if(r == 1 && c == 1){
            System.out.println(p) ;
            return ;
        }
        if(r > 1){
            path(p +'V', r-1 , c ) ;
        }
        if(c > 1){
            path(p + 'H' , r , c-1) ;
        }
    }

    // print the path returning an ArrayList 

    static ArrayList<String> pathRet(String p , int r , int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list;
        }

        ArrayList<String> list = new ArrayList<>() ;

        if( r > 1) {
            list.addAll(pathRet(p + 'D', r-1, c)) ;
        }
        if(c > 1) {
            list.addAll(pathRet(p + 'R', r, c-1));
        }
        return list ;
    }

    // if we move Diagonaly 
    static ArrayList<String> pathRetDaigonal(String p , int r , int c){ 
        if(r == 1 && c == 1){ 
            ArrayList<String> list = new ArrayList<>() ; 
            list.add(p) ; 
            return list;
        }

        ArrayList<String> list = new ArrayList<>() ;
        if(r > 1 && c > 1){
            list.addAll(pathRetDaigonal(p + 'D', r -1 , c -1)) ; 
        }
        if( r > 1) {
            list.addAll(pathRetDaigonal(p + 'V', r-1, c)) ; 
        }
        if(c > 1) {
            list.addAll(pathRetDaigonal(p + 'H', r, c-1)); 
        }
        return list ;
    }
}
