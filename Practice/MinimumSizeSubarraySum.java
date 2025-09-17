package Practice;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,2,4,3}, 7));
    }

    static int solution (int arr[], int k) {
        int left = 0, right = 0, sum = 0, minLen = Integer.MAX_VALUE; 

        for(right = 0; right < arr.length; right++) {
            sum += arr[right]; 

            while(sum>=k) {
                minLen = Math.min(right - left + 1, minLen);
                sum -= arr[left];
                left ++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
