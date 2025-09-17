package Practice;

import java.util.HashMap;

public class subarraysDivByK {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,5,0,-2,-3,1}, 5));
    }

    static int solution(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0, count = 0;

        for (int num : arr) {
            prefixSum += num;

            int rem = ((prefixSum % k) + k) % k;

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}