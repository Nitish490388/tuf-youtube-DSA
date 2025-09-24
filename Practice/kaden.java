package Practice;

import java.util.Arrays;

public class kaden {
    public static void main(String[] args) {
        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums2 = { 1, 2, 3 };
        int[] nums3 = { -5, -2, -3 };

        for(int n: solution2(nums2)) {
            System.out.print(n+" ");
        }
    }

    static int solution(int arr[]) {

       

        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // either extend the subarray or start new at arr[i]
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    static int[] solution2(int arr[]) {

        int start = 0, end = 0, s = 0;
        int currSum = arr[0];
        int maxSum = arr[0];

         for (int i = 1; i < arr.length; i++) {
           if(arr[i] >= currSum + arr[i]) {
            currSum = arr[i];
                s = i;
           } else {
                currSum += arr[i];
            }

             if (currSum > maxSum) {
                maxSum = currSum;
                start = s;
                end = i;
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
