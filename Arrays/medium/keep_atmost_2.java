package Arrays.medium;
// 
// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

public class keep_atmost_2 {

    public static int removeDuplicates(int[] nums) {
        int count = 0,  i = 0;
        int start = 0, end = nums.length;
        int curr = nums[0];

        while(start<end) {

            if(nums[start] == curr) {
                count ++;
            } else {
                curr = nums[start];
                count = 1;
            }
            if(count <= 2) {
                nums[i++] = curr;
            } 
            start ++;
        }
        
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,2,2,2,3};
        int n = removeDuplicates(arr);
        System.out.println(n);
        for(int i: arr) {
            System.out.print(i+ " ");
        }
    }
}
