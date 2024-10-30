package Arrays.easy;

import java.util.HashMap;

public class evenOdd {
    public static void main(String[] args) {
      
        int arr[] = new int[] {2, 1, 2, 1, 5, 5, 2};
        System.out.println(countEvenOdd(arr, arr.length).toString());
    }

    public static int[] countEvenOdd(int[] arr, int n) {
		// Write your code here.

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int x: arr) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		int oddCount = 0, evenCount = 0;
		

		for(int k: map.values()) {
			if((k & 1 )== 1) {
				oddCount++;
			} else {
				evenCount++;
			}
		}
		return new int[] {oddCount, evenCount};
	}

}
