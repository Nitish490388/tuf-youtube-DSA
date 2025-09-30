package gfg;

import java.util.HashMap;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        int arr[] = {7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};

        System.out.println(firstRepeated(arr));
    }

    public static int firstRepeated(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(map.containsKey(arr[i])) {
                minIndex =Math.min(minIndex, map.get(arr[i]));
            }
            map.put(arr[i], i);
        }
        if(minIndex < Integer.MAX_VALUE) return minIndex+1;
        return -1;
    }
}