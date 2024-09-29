package Arrays;

public class left_rotate_by_n {

    static int[] rotate(int[] arr,int d, int n) {
        int i = 0;
        reverse(arr, i, d-1);
        reverse(arr, d, n-1);

        reverse(arr, i, n-1);
        return arr;
    }

    static void reverse(int[] arr, int i, int j) {
        
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
       rotate(arr, 1, arr.length);

       for(int a: arr){
        System.out.println(a);
       }
    }
}
