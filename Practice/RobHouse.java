package Practice;

public class RobHouse {

    public static void main(String[] args) {
        int[] houses = {4,1,1,4};
        
        int dp[] = new int[houses.length];
        for (int j = 0; j < houses.length; j++) dp[j] = -1;
        System.out.println(robRec(houses, houses.length-1, dp));
    }
    
    static int robRec(int[] nums, int i, int[] dp) {
        if(i == 0) return nums[0];

        if(i<0) return 0;

        int robThis = nums[i] + robRec(nums, i-2, dp);
        int skipThis = robRec(nums, i-1, dp);
        
         dp[i] = Math.max(robThis, skipThis);
        return dp[i];
    }
}
