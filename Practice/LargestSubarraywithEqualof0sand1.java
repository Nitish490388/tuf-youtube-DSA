package Practice;

import java.util.HashMap;

public class LargestSubarraywithEqualof0sand1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,0,0,0}));
        System.out.println(solution(new int[]{0,1}));
        System.out.println(solution(new int[]{1,1,0,0,1,0}));
    }

    static int solution(int[] arr) {
        int sum = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
