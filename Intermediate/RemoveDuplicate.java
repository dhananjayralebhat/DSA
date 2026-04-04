import java.util.*;
public class RemoveDuplicate {

    public static void duplicate(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 7, 4, 1, 8, 4};

        duplicate(arr);
    }
}