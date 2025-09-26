import java.util.*;
public class binarySearch{
    public static int binary(int num[], int key){
        int start=0, end = num.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;   
    }
    public static void main(String[] args) {
        int num[] = {1, 4, 7, 8, 10, 11};
        int key = 10;

        System.out.println(binary(num, key));
    }
}