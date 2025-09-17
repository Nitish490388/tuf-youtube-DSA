package Practice;

public class maxSumSubarrayOfSizeK {

    public static void main(String[] args) {
        
        System.out.println(solution(new int[]{2,1,5,1,3,2}, 3));
    }
    
    static int solution(int[] arr, int k) {
    if (arr.length < k) return 0; // edge case

    int windowSum = 0;
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }

    int maxSum = windowSum;

    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}

}
