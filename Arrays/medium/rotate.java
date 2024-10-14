package Arrays.medium;

/**
 * rotate
 */
public class rotate {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        
        reverse(nums, 0, n - 1); 
        reverse(nums, 0, k - 1); 
        reverse(nums, k, n - 1);
        
    }

    static void reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotate(arr, 3);

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}