package Arrays;

public class missingElement {
    public static int findMissingNumber(int arr[], int n) {
        int ans = 0;
        for(int i = 0;  i< n; i++) {
            ans = i^arr[i];
        }
        return ans^n+1;
    }

    public static void main(String[] args) {
        // int[] arr1 = {1,2,3,5};

    }
}
