import java.util.*;
public class bubbleSort{
    public static void bubbleSort(int num[]){
        for(int turn=0; turn<num.length; turn++){
            int swap = 0;
            for(int j=0; j<num.length-1-turn; j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        bubbleSort(num);
        printArray(num);
    }
}
