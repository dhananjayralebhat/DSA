import java.util.*;
public class insertionSort{
    public static void insertionSort(int num[]){
        for(int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;

            while(prev >= 0 && num[prev] > curr){
                num[prev+1] = num[prev];
                prev--;
            }
            num[prev+1] = curr;
        }
    }
    public static void printArray(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        int num[] = {1, 4, 2, 5, 3};
        insertionSort(num);
        printArray(num);
    }
}