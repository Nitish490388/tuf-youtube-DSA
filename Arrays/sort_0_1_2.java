package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class sort_0_1_2 {


    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
        
    }
    public static void main(String[] args) {

        Integer arr[] = {1,2,0,0,2,1,0,1};
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(arr));
        sortArray(ar, ar.size());
        for(Integer a: ar) {
            System.out.print(a+" ");
        }
    }
}
