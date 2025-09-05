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
        int k = arr.length;
        // System.out.println(getLongestSubarray(arr, k));

        int dp[] = new int[k];
        for(int i = 0; i< k; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        System.out.println(solve(arr, k-1, dp));
    }

    static int solve(int[] nums, int n, int[] dp) {
        if(n == 1) return nums[0];

         if (dp[n] != Integer.MIN_VALUE) return dp[n];

        int extend = solve(nums, n-1, dp) + nums[n];
        int startNew = nums[n];

         dp[n] = Math.max(extend, startNew);
        return dp[n];
    }
}
