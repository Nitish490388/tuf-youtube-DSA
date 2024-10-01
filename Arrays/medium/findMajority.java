// Find the Majority Element that occurs more than N/2 times

package Arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class findMajority {

    // using map time complexity = O(2n), Space complexity = O(n)
    public static int majorityElement(int[] v) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = v.length;
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(v[i], 0);
            map.put(v[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > n / 2) {
                return it.getKey();
            }
        }

        return -1;
    }

    // Optimal solution
    public static int majorityElement_Optimal(int[] v) {
        int elm = 0;
        int count = 0;
        int n = v.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                elm = v[i];
                count = 1;
            }

            else if (v[i] == elm) {
                count++;
            } else {
                count--;
            }

        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == elm) cnt1++;
        }

        if (cnt1 > (n / 2)) return elm;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2, 0, 0, 0, 0 };
        int ans = majorityElement_Optimal(arr);
        System.out.println("The majority element is: " + ans);
    }
}
