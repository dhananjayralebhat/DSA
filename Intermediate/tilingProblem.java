import java.util.*;
public class tilingProblem{
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //verticle
        int fnm1 = tiling(n-1);

        //horizantal
        int fnm2 = tiling(n-2);

        int totWays = fnm1 + fnm2;
        return totWays; //it followes fabonicci sequence
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
