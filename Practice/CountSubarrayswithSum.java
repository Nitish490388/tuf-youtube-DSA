
package Practice;

import java.util.HashMap;

public class CountSubarrayswithSum {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1}, 2));
        System.out.println(solution(new int[]{1,2,3}, 3));
        System.out.println(solution(new int[]{3,4,7,2,-3,1,4,2}, 7));
    }
    static int solution(int arr[], int k) {
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;

        for(int n: arr) {
            sum += n;
            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }  
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}