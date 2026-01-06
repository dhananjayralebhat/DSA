import java.util.*;
public class kadanesSubArraySum{    
public static void kadanes(int num[]){
    int cs = 0;
    int ms = Integer.MIN_VALUE;

    for(int i=0; i<num.length; i++){
        cs += num[i];
        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println(ms);
}
public static void main(String[] args) {
    int num[] = {1, -2, 4, 7, 8};
    kadanes(num);
}
}