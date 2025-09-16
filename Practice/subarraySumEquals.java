package Practice;

import java.util.HashMap;
import java.util.Map;

public class subarraySumEquals {
    public static void main(String[] args) {
         System.out.println(solution(new int[]{3,1,2,1,1,1,2}, 3));
    }

    static int solution(int[] arr, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
          int currSum = 0, count = 0;

        for(int n: arr) {
            currSum += n;
            if(prefixSum.containsKey(currSum-k)) {
                count += prefixSum.get(currSum-k);
            }
            prefixSum.put(currSum, prefixSum.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
