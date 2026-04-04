import java.util.*;
public class nonRepeatingLetter{

    public static char nonRepeating(String str){
        Queue<Character> q = new LinkedList<>();

        int freq[] = new int[26];

        for(int i=0; i<str.length(); i++){
            q.add(str.charAt(i));
            freq[str.charAt(i)-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
        }
         if(q.isEmpty()){
                return 'a';
            }
        return q.peek();
    }
    public static void main(String[] args) {
        String str = "aabccxb";

        System.out.println(nonRepeating(str));
    }
}