package Arrays;

/**
 * left_rotate
 */
public class left_rotate {

    
    public static int[] leftRotate(int[] arr, int n) {

        int temp = arr[0] ;
        for(int i = 1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};
        leftRotate(arr, 6);
        // System.out.println(arr.toString());
        for(int a: arr) {
            System.out.println(a);
        }
    }
}