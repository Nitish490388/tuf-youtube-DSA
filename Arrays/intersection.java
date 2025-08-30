 package Arrays;
import java.util.*;

public class intersection {
    static ArrayList<Integer> findIntersection (int arr1[], int[] arr2, int n, int m) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (intersection.size() == 0 || intersection.get(intersection.size() - 1) != arr1[i]) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return intersection;
    }
    
    public static void main(String[] args) {
    int arr1[] = {1,2,3,4};
    int arr2[] = {3,4};
   ArrayList<Integer> al = findIntersection(arr1, arr2, arr1.length, arr2.length);
   for(int a: al ) {
    System.out.print(a+" ");
   }
   
}
}

// time comlexity O(n)
// Space complexity O(1)

