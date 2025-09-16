package Practice;

import java.util.HashMap;

public class LongestSubarraywithSum {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int  k = 15;
        System.out.println(solution(arr, k));
    }

    static int solution (int arr[], int k) {
        int maxLenght = 0, currLength = 0, sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i< arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxLenght = i+1;
            }

            if(map.containsKey(sum-k)) {
                currLength += i - map.get(sum-k);
                maxLenght = Math.max(maxLenght, currLength);
            } else {
                map.putIfAbsent(sum, i);
            }
        }
        return maxLenght;
    }
}
