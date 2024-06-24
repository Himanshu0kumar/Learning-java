/* This is will print the pattern

 *          * * * *
 *          * * *
 *          * * 
 *          *
 */
public class Trangle{
    public static void main(String[] args) {
        patternTrangle(4, 0);
    }

    static void patternTrangle (int r , int c){
        if(r == 0 ){
            return ;
        }
        if(c < r){
            System.out.print(" * ");
            patternTrangle(r, c+1);
        }
        else{
            System.out.println();
            patternTrangle(r-1, 0);
        }
    }
}