package Arrays;

/**
 * move_zeros_to_end
 */
public class move_zeros_to_end {

    static int[] moveZeros(int[] arr, int n) {
        int j = -1;
        for(int i = 0; i<n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        if(j < 0) return arr;

        for(int i = j+1; i<n ;i++) {
            if(arr[i] > 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,0,6};
        moveZeros(arr, arr.length);

        for(int a: arr) {
            System.out.println(a);
        }
    }
}

// time complexity O(x) + O(n-x) = O(n)