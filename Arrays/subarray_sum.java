package Arrays;

public class subarray_sum {
    
    static int getLongestSubarray(int []a, long k) {
        int l = a.length;
    
        int i = 0;
        int j = 0;
        long sum = a[0];  // Use long to avoid overflow when adding elements to sum
        int maxlen = 0;

        while(j<l) {
            while (i <= j && sum > k) {
                sum -= a[i];
                i++;
            }

            if(sum == k) {
                maxlen = Math.max(maxlen, j-i+1);
            }

            j++;
            if (j < l) sum += a[j];
        }

        return maxlen;
    }
    

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,4,0,0,3};
        int k = 8;
        System.out.println(getLongestSubarray(arr, k));
    }
}
