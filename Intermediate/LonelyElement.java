import java.util.*;

public class LonelyElement {

    public static List<Integer> lonely(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] - arr[i - 1] > 1) &&
                (i == arr.length - 1 || arr[i + 1] - arr[i] > 1)) {

                ans.add(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 8};
        System.out.println(lonely(arr));
    }
}
