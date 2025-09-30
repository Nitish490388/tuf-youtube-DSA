package gfg;

import java.util.HashMap;

public class subArraySum {

    public static void main(String[] args) {
        int arr[] = {1, 0, -4, 3, 1, 0};
       System.out.println(maxLength(arr));
    }
    static int maxLength(int arr[]) {
        int maxLen = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            currSum+=arr[i];
            if(currSum == 0)
            maxLen = Math.max(maxLen, i+1);

            if(map.containsKey(currSum)) {
                maxLen = Math.max(maxLen, i-map.get(currSum));
            }else {
                map.put(currSum, i);
            }
        }
        return maxLen;
    }
}