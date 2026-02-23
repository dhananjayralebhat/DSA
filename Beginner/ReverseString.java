import java.util.*;
public class ReverseString{
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
                idx++;
        }
         StringBuilder res = new StringBuilder();
            while (!s.isEmpty()) {
                char ch = s.pop();
                res.append(ch);
            }
         return res.toString();
    }
    public static void print(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "xyz";
        str = reverse(str);
        print(str);
    }
}