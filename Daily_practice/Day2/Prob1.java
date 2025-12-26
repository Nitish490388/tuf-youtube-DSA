package Daily_practice.Day2;

// https://leetcode.com/problems/container-with-most-water/

public class Prob1 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;

        while(left < right) {
            max = Math.max(max, (right - left) * Math.min(height[left], height[right]));

            if(height[left] < height[right]) {
                left++;
            } else {
                right --;
            }
        }

        return max;
    }

}
