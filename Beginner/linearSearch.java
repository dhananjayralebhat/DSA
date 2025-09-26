import java.util.*;
public class linearSearch{
    public static int array(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 7, 8, 10, 11};
        System.out.println(array(arr));
    }
}