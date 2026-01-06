import java.util.*;
public class selectionSort{
    public static void selectionSort(int num[]){
        for(int i=0; i<num.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<num.length; j++){
                if(num[minpos] > num[j]){
                    minpos = j;
                }
            }
            int temp = num[minpos];
            num[minpos] = num[i];
            num[i] = temp; 
        }
    }
    public static void printArray(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
    public static void main(String[] args) {
        int num[] = {1, 4, 2, 3};
        selectionSort(num);
        printArray(num);

    }
}