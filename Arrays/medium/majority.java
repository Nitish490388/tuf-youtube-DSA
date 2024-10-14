package Arrays.medium;

// https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
/**
 * majority
 
 */
public class majority {

    public static int majorityElement(int[] nums) {

        int elm = 0;
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                elm = nums[i];
                count = 1;
            }
            else if (nums[i] == elm) {
                count++;
            } else {
                count--;
            }
        }
        return elm;
    }
    public static void main(String[] args) {
        int nums[]= {2,2,1,1,1,2,2};
    }
}